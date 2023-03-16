package y_2023.m3.week1.d1;

public class Offer04 {


//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        if(matrix == null || matrix.length == 0)
//            return false;
//        int m = matrix.length;
//        int n = matrix[0].length;
//        for(int i = 0; i < m; i++)
//            for(int j = 0; j < n; j++)
//                if(matrix[i][j] == target)
//                    return true;
//        return false;
//    }
//

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] row : matrix) {
            for (int element : row) {
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
