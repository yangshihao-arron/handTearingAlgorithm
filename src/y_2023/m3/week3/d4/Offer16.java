package y_2023.m3.week3.d4;

public class Offer16 {

    public double myPow(double x, int n) {
        int N = n;
        return N > 0 ? quickMul(x, N) : 1 / quickMul(x, -N);
    }
    public double quickMul(double x, long N){
        if(N == 0)
            return 1.0;
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
