package algorithm_Interview_java.c2;

import java.util.Arrays;

public class Q1552 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1] - position[0], ans = -1;
        while(left <= right){
            int mid = (right - left) / 2 + left;
            if(check(mid, position, m)){
                ans = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return ans;
    }

    public boolean check(int x, int[] position, int m){
        int pre = position[0], cnt = 1;
        for(int i = 1; i < position.length; i++){
            if(position[i] - pre >= x){
                pre = position[i];
                cnt++;
            }
        }
        return cnt >= m;
    }
}
