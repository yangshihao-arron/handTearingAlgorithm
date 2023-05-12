package y_2023.m5.week2.d5;

import java.util.Arrays;

public class Q455_2 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        int res = 0;
        while(si < s.length && gi < g.length){
            if(s[si] >= g[gi]){
                gi++;
                res ++;
            }
            si ++;
        }
        return res;
    }
}
