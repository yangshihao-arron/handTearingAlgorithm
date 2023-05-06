package y_2023.m5.week1.d6;

public class Q329 {

    private int[][] memo; //记忆化递归的搜索矩阵
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
            return 0;

        int row = matrix.length, col = matrix[0].length;
        int maxPathLen = 0;
        memo = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int curLen = dfs(matrix, i, j, Integer.MIN_VALUE);
                maxPathLen = Math.max(curLen, maxPathLen);
            }
        }
        return maxPathLen;
    }

    public int dfs(int[][] matrix, int i, int j,int preVal){

         if(i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] <= preVal)
             return 0;

         if(memo[i][j] != 0) return memo[i][j];

         int up = dfs(matrix, i - 1, j, matrix[i][j]);
         int down = dfs(matrix, i + 1, j, matrix[i][j]);
         int left = dfs(matrix, i, j - 1, matrix[i][j]);
         int right = dfs(matrix, i, j + 1, matrix[i][j]);

         int curMax =  Math.max(Math.max(Math.max(up,down),left),right) + 1;
         memo[i][j] = curMax;
         return curMax;
    }

}
