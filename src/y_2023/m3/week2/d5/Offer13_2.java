package y_2023.m3.week2.d5;

public class Offer13_2 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(visited, 0, 0, k);
    }

   public int dfs(boolean[][] visited, int i, int j, int k){
        if(i < 0 || i >= visited.length || j < 0 || j >=visited[0].length || visited[i][j] || get(i) + get(j) > k){
            return 0;
        }
        int res = 0;
        visited[i][j] = true;
        res = dfs(visited, i,j + 1, k) + dfs(visited, i, j - 1, k) + dfs(visited, i + 1, j, k) + dfs(visited, i - 1, j, k);
        return res + 1;
   }

   public int get(int sum){
        int res = 0;
        while(sum != 0){
            res += sum % 10;
            sum /= 10;
        }
        return res;
   }
}
