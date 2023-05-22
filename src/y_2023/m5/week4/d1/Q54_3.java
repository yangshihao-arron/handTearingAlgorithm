package y_2023.m5.week4.d1;

import java.util.ArrayList;
import java.util.List;

public class Q54_3 {


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }

        int rows = matrix.length, columns = matrix[0].length;
        int left = 0, right = columns - 1, top = 0, bottom = rows - 1;

        while (left <= right && top <= bottom) {
            for (int j = left; j <= right; j++)
                res.add(matrix[top][j]);
            for (int i = top + 1; i <= bottom; i++)
                res.add(matrix[i][right]);
            if(top < bottom && left < right){
                for(int j = right-1; j > left; j--)
                    res.add(matrix[bottom][j]);
                for(int i = bottom; i > top; i--)
                    res.add(matrix[i][left]);
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return res;

    }


}
