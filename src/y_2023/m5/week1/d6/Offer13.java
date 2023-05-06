package y_2023.m5.week1.d6;

public class Offer13 {

    boolean[][] visited;
    public int movingCount(int m, int n, int k){
        visited = new boolean[m][n];
        return dfs(0, 0, k);
    }

    public int dfs(int i, int j, int k){
        if(i >= visited.length || j >= visited[0].length || visited[i][j] || bitSum(i) + bitSum(j) > k)
            return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, k) + dfs(i, j + 1, k);
    }

    public int bitSum(int x){
        int sum = 0;
        while (x != 0){
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
