package y_2023.m3.week3.d3;

public class Offer64 {

    public int sumNums(int n) {
        return  n == 0 ? 0 :  n + sumNums(n - 1);
    }

    public static void main(String[] args) {
        int res = new Offer64().sumNums(9);
        System.out.println(res);
    }
}
