package y_2023.m3.week1.d4;

public class Offer10_I {


    public static int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int[] dp = new int[n + 1];
        final int MOD = 1000000007;
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++)
            dp[i] = (dp[i - 1] + dp[i-2]) %MOD;
        return dp[n];
    }

    public static void main(String[] args) {
        int res = fib(45);
        System.out.println(res);
    }
}
