package y_2023.m5.week2.d4;

import java.util.ArrayList;
import java.util.List;

public class Q54_2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0)
            return list;
        int m = matrix.length;
        int n = matrix[0].length;
        int index = 0;

        //统计矩阵从外向内的层数，如果矩阵非空，那么它的层数至少为1层
        int count = (Math.min(m, n)+1)/2;
        //从外部向内部遍历，逐层打印数据
        while(index < count) {
            for (int j = index; j < n-index; j++) {
                list.add(matrix[index][j]);
            }
            for (int i = index+1; i < m-index; i++) {
                list.add(matrix[i][(n-1)-index]);
            }

            for (int j = (n-1)-(index+1); j >= index && (m-1-index != index); j--) {
                list.add(matrix[(m-1)-index][j]);
            }
            for (int i = (m-1)-(index+1); i >= index+1 && (n-1-index) != index; i--) {
                list.add(matrix[i][index]);
            }
            index++;
        }
        return list;
    }

}
