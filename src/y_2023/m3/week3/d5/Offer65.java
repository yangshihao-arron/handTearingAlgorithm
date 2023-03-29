package y_2023.m3.week3.d5;

public class Offer65 {
    public int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 20, b = 17;
        int res = new Offer65().add(a, b);
        System.out.println(res);
    }
}
