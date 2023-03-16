package y_2023.m3.week1.d1;

public class Offer04_3 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0)
            return false;
        int m = matrix.length, n = matrix[0].length;
        int x = 0, y = n - 1;
        while(x < m && y >= 0){
            if(matrix[x][y] == target)
                return true;
            else if(matrix[x][y] > target)
                y--;
            else
                x++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {};
        System.out.println(matrix.length );
        int[][] matrix1 = {{}};
        System.out.println(matrix1.length + " " + matrix1[0].length);
        System.out.println(new Offer04_3().findNumberIn2DArray(matrix,2));
    }

}
