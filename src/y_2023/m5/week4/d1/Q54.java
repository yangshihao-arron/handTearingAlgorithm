package y_2023.m5.week4.d1;

import java.util.ArrayList;
import java.util.List;

public class Q54 {

    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return null;
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> res = new ArrayList<>();
        int directionIndex = 0;
        int row = 0, col = 0;
        int total = rows * cols;
        for (int i = 0; i < total; i++){
            res.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[directionIndex][0];
            int nextCol = col + directions[directionIndex][1];
            if(nextRow < 0 || nextRow >= rows || nextCol < 0 || nextCol >= cols || visited[nextRow][nextCol]){
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
        }
            return res;
    }

}
