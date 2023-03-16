package y_2023.m3.week1.d4;

public class Offer10_II {

    final int MOD = 1000000007;
    public int numWays(int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return n;
        int[] res = new int[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
        for(int i = 3; i <= n; i++)
            res[i] = (res[i - 1] + res[i - 2]) % MOD;
        return res[n];
    }

    public static void main(String[] args) {
        int res = new Offer10_II().numWays(5);
        System.out.println(res);
    }
}
