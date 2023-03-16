package y_2023.m3.week1.d4;

public class Offer10_I_3 {
    private int[] res;
    final int MOD =  1000000007;
    public  int fib(int n) {
        res = new int[n];
        if(n <= 1)
            return n;

        return (f(n - 1) + f(n - 2)) % MOD;
    }
    private int f(int n){
        if(n == 0 || n == 1) return n;
        if(res[n] != 0)
            return res[n];
        res[n] = (f(n - 1) + f(n - 2)) % MOD;
        return res[n];
    }

    public static void main(String[] args) {
        int ans = new Offer10_I_3().fib(45);
        System.out.println(ans);

    }
}
