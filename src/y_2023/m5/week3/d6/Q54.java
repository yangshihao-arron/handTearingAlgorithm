package y_2023.m5.week3.d6;

import java.util.ArrayList;
import java.util.List;

public class Q54 {

    public List<Integer> spiralOrder(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] visited = new boolean[rows][cols];
        int total = rows * cols;
        int row = 0, col = 0;
        int directionIndex = 0;
        for(int i = 0; i < total; i++){
            res.add(matrix[row][col]);
            visited[row][col] = true;
            int nextRow = row + directions[directionIndex][0];
            int newCol = col + directions[directionIndex][1];
            if(nextRow < 0 || nextRow >= rows || newCol < 0 || newCol >= cols || visited[nextRow][newCol])
            {
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            col += directions[directionIndex][1];
        }
        return res;
    }

}
