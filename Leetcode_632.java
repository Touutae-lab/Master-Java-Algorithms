public class Leetcode_632 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);


        root.right.left = new TreeNode(5);


        TreeNode result = solution.addOneRow(root, 1, 2);

    }
}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
     }
}

class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }

        traverseNode(root, val, 1, depth);
        return root;
    }

    private void traverseNode(TreeNode root, int val, int depth, int targetDept) {
        
        if (root == null) {
            return;
        }


        if (depth == targetDept - 1) {
            TreeNode left = new TreeNode(val);
            TreeNode right = new TreeNode(val);

            left.left = root.left;
            right.right = root.right;

            root.left = left;
            root.right = right;

            return;
        }

        traverseNode(root.left, val, depth + 1, targetDept);
        traverseNode(root.right, val, depth + 1, targetDept);
    }
}