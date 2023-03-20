package y_2023.m3.week2.d5;

import java.util.LinkedList;
import java.util.Queue;

public class Offer13 {
    public int movingCount(int m, int n, int k) {
        if(k == 0)
            return 1;
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {0 ,1};
        int[] dy = {1, 0};
        boolean[][] visited = new boolean[m][n];
        queue.offer(new int[]{0,0});
        visited[0][0] = true;
        int res = 1;
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int x = cell[0],y = cell[1];
            for(int i = 0; i < 2; i++){
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if(tx < 0 || tx >= m || ty < 0 || ty >= n || visited[tx][ty] || get(tx) +get(ty) > k){
                    continue;
                }
                queue.offer(new int[] {tx, ty});
                visited[tx][ty] = true;
                res++;
            }
        }
        return res;
    }
    public int get(int num){
        int res = 0;
        while(num != 0){
            res += num % 10;
            num /= 10;
        }
        return res;
    }

}
