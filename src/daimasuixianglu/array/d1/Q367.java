package daimasuixianglu.array.d1;


public class Q367 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = 1 << 16;
        while(left <= right){
            int mid = (right - left) / 2 +left;
            if((long)mid * mid == num)
                return true;
            else if((long)mid * mid < num)
                left = mid +1;
            else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 2147395600;
        boolean res = new Q367().isPerfectSquare(num);
        System.out.println(res);
    }
}
