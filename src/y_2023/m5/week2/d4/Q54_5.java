package y_2023.m5.week2.d4;

import java.util.ArrayList;
import java.util.List;

public class Q54_5 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<Integer>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }

        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;
        while (left <= right && top <= bottom) {

            for (int column = left; column <= right; column++) {
                res.add(matrix[top][column]);
            }

            for (int row = top + 1; row <= bottom; row++) {
                res.add(matrix[row][right]);
            }

            if (left < right && top < bottom) { // 防止一行或一列的情况
                for (int column = right - 1; column > left; column--) {
                    res.add(matrix[bottom][column]);
                }
                for (int row = bottom; row > top; row--) {
                    res.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}};
        // int[][] matrix = {{1},{2},{3}};
        List<Integer> res = new Q54_5().spiralOrder(matrix);
        System.out.println(res);
    }
}
