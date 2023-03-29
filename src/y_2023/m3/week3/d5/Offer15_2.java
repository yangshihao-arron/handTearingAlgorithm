package y_2023.m3.week3.d5;

public class Offer15_2 {
     // (n-1)解析：二进制数字n最右边的1变成0，此1右边的0变成1。
    // n&(n-1)解析:二进制数字n最右边的1变成0，其余不变。
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res++;
            n = n & (n - 1);
        }
        return res;
    }
}
