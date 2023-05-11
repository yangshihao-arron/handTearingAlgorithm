package y_2023.m5.week2.d4;

import java.util.ArrayList;
import java.util.List;

public class Q54 {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // 定义上下左右四条边界
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while (true) {
            // 1.首先从左往右，遍历最上一行
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            // 遍历完将上边界下移
            top++;
            // 如果上边界比下边界大，说明这轮遍历就已经将整个矩阵遍历完，直接跳出循环返回结果即可
            if (top > bottom) {
                break;
            }
            // 2.然后从上往下遍历最右边一列
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            // 遍历完将右边界左移
            right--;
            // 如果右边界比左边界小，说明这轮遍历已经将整个矩阵遍历完，直接跳出循环
            if (right < left) {
                break;
            }
            // 3.然后从右往左遍历最下面一行
            for (int j = right; j >= left; j--) {
                result.add(matrix[bottom][j]);
            }
            // 遍历完将下边界上移
            bottom--;
            // 如果上移的下边界比上边界小，说明这轮遍历已经将整个矩阵遍历完，跳出循环
            if (bottom < top) {
                break;
            }
            // 4.从下往上遍历最左边一列
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            // 遍历完将左边界右移
            left++;
            // 如果左边界比有边界大，说明这轮遍历已经将整个矩阵遍历完，跳出循环
            if (left > right) {
                break;
            }
        }
        return result;
    }

}
