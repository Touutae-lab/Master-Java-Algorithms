class Scratch {
    public static void main(String[] args) {
        char[][] result = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String target = "ABCCED";

        Solution sol = new Solution();

        System.out.println(sol.exist(result, target));

    }

}

class Solution {
    private int row;

    private int col;

    private String target;

    private char[][] gameBoard;
    public boolean exist(char[][] board, String word) {
        row = board.length;
        col = board[0].length;
        target = word;
        gameBoard = board;

        for(int i = 0; i < row; i ++) {
            for (int j = 0; j < col; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int index) {

        if (i < 0 || j < 0 || i >= row || j >= col || gameBoard[i][j] == '0' || gameBoard[i][j] != target.charAt(index)) {
            return false;
        }

        if (index == target.length() - 1) {
            return true;
        }

        char temp = gameBoard[i][j];
        gameBoard[i][j] = '0';

        boolean result =
                dfs(i + 1, j, index + 1) ||
                dfs(i - 1, j, index + 1) ||
                dfs(i, j - 1, index + 1) ||
                dfs(i, j + 1, index + 1);

        gameBoard[i][j] = temp;

        return result;
    }
}