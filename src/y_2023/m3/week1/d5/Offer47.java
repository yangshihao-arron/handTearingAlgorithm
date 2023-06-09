package y_2023.m3.week1.d5;

public class Offer47 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        for(int j = 1; j < col; j++){
            dp[0][j]  = dp[0][j-1] + grid[0][j];
            System.out.print(dp[0][j] + " ");
        }
        System.out.println();
        for(int i = 1; i < row; i++){
            dp[i][0] =dp[i - 1][0] + grid[i][0];
            System.out.print(dp[i][0] + " ");
        }
        System.out.println();
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]) + grid[i][j];
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[row - 1][col -1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int res = new Offer47().maxValue(grid);
        System.out.println(res);
    }
}
