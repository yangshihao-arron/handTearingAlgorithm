package y_2023.m5.week4.d1;

import java.util.ArrayList;
import java.util.List;

public class Q54_2 {

    public static int[][] directions = {{0,1},{1,0},{0, -1},{-1, 0}};
    public int direction = 0;
    //定义一个标记矩阵，每次遍历完 matrix 的方格，用标记矩阵标记
    public boolean[][] visited;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        visited = new boolean[rows][cols];
        dfs(res, matrix, rows, cols, 0, 0);

        return res;

    }

    public void dfs(List<Integer> res, int[][] matrix, int rows, int cols, int x, int y){
        if(x < 0 || x >= rows || y < 0 || y >= cols || visited[x][y]){
            //撞到墙了，需要转向
            direction = (direction + 1) % 4;
            return;
        }
        res.add(matrix[x][y]);
        visited[x][y] = true;
        for (int i = 0; i < 2; i++) {
            int mx = x + directions[direction][0];
            int my = y + directions[direction][1];
            dfs(res, matrix, rows, cols, mx, my);
        }
    }

}
