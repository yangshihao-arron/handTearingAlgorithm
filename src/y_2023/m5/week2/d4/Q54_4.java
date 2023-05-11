package y_2023.m5.week2.d4;

import java.util.ArrayList;
import java.util.List;

public class Q54_4 {
    public static int[][] directions = {{0,1},{1,0},{0, -1},{-1, 0}};
    //public static int direction = 0;  定义为static,在多次运行后，某一次开始是direction可能不是从0开始，所以测试用例报错了
    public int direction = 0;
    //定义一个标记矩阵，每次遍历完 matrix 的方格，用标记矩阵标记
    public boolean[][] seen;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        seen = new boolean[rows][cols];
        dfs(res, matrix, rows, cols, 0, 0);

        return res;
    }
    public void dfs(List<Integer> res, int[][] matrix, int rowNums, int colNums, int x, int y) {
        //判断条件：超出边界，或者遇到已经赋值过的方格
        if (x < 0 || x >= rowNums || y < 0 || y >= colNums || seen[x][y] == true) {
            //撞到墙了，需要转向
            direction = (direction + 1) % 4;
            return;
        }
        //标记该方格
        seen[x][y] = true;
        //添加该方格进数组
        res.add(matrix[x][y]);
        //循环供一次原方向，一次转向
        for (int i = 0; i < 2; i++) {
            int mx = x + directions[direction][0];
            int my = y + directions[direction][1];
            //递归下一个方格
            dfs(res, matrix, rowNums, colNums, mx, my);
        }
    }
}
