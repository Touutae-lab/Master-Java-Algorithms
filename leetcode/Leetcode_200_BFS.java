package leetcode;

// Faster than DFS
public class Leetcode_200_BFS {
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
    private void bfs(char[][] grid, int x, int y) {
        if (x > 0 && grid[x-1][y] == '1') {
            grid[x-1][y] = '0';
            bfs(grid, x-1, y);
        }
        if (x < grid.length - 1 && grid[x+1][y] == '1') {
            grid[x+1][y] = '0';
            bfs(grid, x+1, y);
        }
        if (y > 0 && grid[x][y-1] == '1') {
            grid[x][y-1] = '0';
            bfs(grid, x, y-1);
        }
        if (y < grid[0].length - 1 && grid[x][y+1] == '1') {
            grid[x][y+1] = '0';
            bfs(grid, x, y+1);
        }
    }

    public int numIslands(char[][] grid) {

        if (grid.length == 0) {
            return 0;
        }

        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    islandCount++;
                    bfs(grid, i, j);
                }
            }
        }
        return islandCount;
    }
}