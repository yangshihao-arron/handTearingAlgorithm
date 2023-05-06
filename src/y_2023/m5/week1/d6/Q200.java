package y_2023.m5.week1.d6;

public class Q200 {

    public int numIslands(char[][] grid) {
        int row = grid.length, col = grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    sum++;
                }
            }
        return sum;
    }

    public void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }

}
