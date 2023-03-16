package y_2023.m3.week1.d4;

public class Offer10_I_2 {
    public static int fib(int n) {
        final int MOD =  1000000007;
        if (n < 2)
            return n;
        int p = 0, q = 0, r = 1;
        for(int i = 2 ; i <=n ; i++){
            p = q;
            q = r;
            r = (p + q ) % MOD;
        }
        return r;
    }
}
