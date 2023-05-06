package y_2023.m5.week1.d6;

public class Q695 {

    int maxArea = 0;
    boolean[][] visited;
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        visited = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    int currentArea = dfs(grid, i, j);
                    maxArea = Math.max(currentArea, maxArea);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i , int j){
        if(!inArea(grid, i, j))
            return 0;
        visited[i][j] = true;
        int left = dfs(grid, i-1, j);
        int right = dfs(grid, i + 1, j);
        int up = dfs(grid, i, j - 1);
        int down = dfs(grid, i, j+ 1);
        return left + right + up + down + 1;
    }

    public boolean inArea(int[][] grid, int i , int j){
        int row = grid.length;
        int col = grid[0].length;
        if(i < 0 || i >= row || j < 0 || j >= col || visited[i][j] || grid[i][j] == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0}
                ,{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0}
                ,{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int res = new Q695().maxAreaOfIsland(grid);
        System.out.println(res);


    }

}
