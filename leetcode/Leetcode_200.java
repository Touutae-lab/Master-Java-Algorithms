package leetcode;

public class Leetcode_200 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] grid = new char[][] {
           {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        System.out.println(solution.numIslands(grid));


        grid = new char[][] {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        System.out.println(solution.numIslands(grid));


        grid = new char[][] {
            {'1','1','1'},
            {'0','1','0'},
            {'1','1','1'}
        };

        System.out.println(solution.numIslands(grid));

    }
}

class Solution {
    private void dfs(char[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0') {
            return;
        }

        grid[x][y] = '0';

        dfs(grid, x+1, y);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x, y-1);
    }

    public int numIslands(char[][] grid) {

        if (grid.length == 0) {
            return 0;
        }

        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    dfs(grid, i, j);
                }
            }
        }
        return islandCount;
    }
}