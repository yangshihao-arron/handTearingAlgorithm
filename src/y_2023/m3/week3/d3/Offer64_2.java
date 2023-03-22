package y_2023.m3.week3.d3;

public class Offer64_2 {
    int res = 0;
    public int sumNums(int n){
        boolean flag = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}
