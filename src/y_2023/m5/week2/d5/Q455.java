package y_2023.m5.week2.d5;

import java.util.Arrays;

public class Q455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = g.length - 1;
        int si = s.length - 1;
        int res = 0;
        while(gi >= 0 && si >=0){
            if(s[si] >= g[gi]){
                res ++;
                si --;
            }
            gi --;
        }
        return res;
    }

    public static void main(String[] args) {
        Integer[] res = {1,3,5,2,4,6};
        Arrays.sort(res);

        System.out.println(res[0]);
    }
}
