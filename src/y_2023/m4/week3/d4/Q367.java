package y_2023.m4.week3.d4;

import java.util.HashSet;
import java.util.Set;

public class Q367 {


    public boolean isPerfectSquare(int num) {
        int left = 1, right = 46340;

        while(left <= right){
            int mid = (left + right) / 2;
            int res = mid * mid;
            if(res == num)
                return true;
            else if(res < num){
                left = mid + 1;
            }else
                right = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int left = 1, right = (int) (Math.pow(2, 16) - 1);
        System.out.println(right);
    }
}
