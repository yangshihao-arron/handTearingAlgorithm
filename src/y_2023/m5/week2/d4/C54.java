package y_2023.m5.week2.d4;

import java.util.ArrayList;
import java.util.List;

public class C54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while(true){
            for(int j = left; j <= right; j++)
                res.add(matrix[top][j]);
            top++;
            if(top > bottom)
                break;
            for(int i = top; i <= bottom; i++)
                res.add(matrix[i][right]);
            right--;
            if (right < left)
                break;
            for(int j = right; j >= left; j--){
                res.add(matrix[bottom][j]);
            }
            bottom--;
            if (bottom < top) {
                break;
            }
            for(int i = bottom; i >= top; i-- ){
                res.add(matrix[i][left]);
            }
            left++;
            if(left > right)
                break;
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] matrix =  {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> res = new C54().spiralOrder(matrix);
        System.out.println(res);
    }

}
