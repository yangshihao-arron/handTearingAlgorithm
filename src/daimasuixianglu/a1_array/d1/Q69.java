package daimasuixianglu.a1_array.d1;

public class Q69 {

    public int mySqrt(int x) {
        int left = 0, right = x;
        int ans = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if ((long)mid * mid <= x) {  //没有(long)会报错 2147395599 输出2147395599  预期结果46339
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int res = new Q69().mySqrt(8);
        System.out.println(res);
    }

}
