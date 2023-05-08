package y_2023.m5.week2.d1;

public class Q91 {

    // dp[i] 为考虑前 i 个字符的解码方案数
    // 上楼梯问题的变种
    public int numDecodings(String ss) {
        int n = ss.length();
        char[] s = ss.toCharArray();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++){
            dp[i] = 0;
            int t = s[i - 1] - '0';
            if(t>=1 && t <= 9){
                dp[i] += dp[i-1];
            }
            if(i >= 2){
                t = (s[i-2] - '0') * 10 + (s[i-1] - '0');
                if(t >= 10 && t <= 26)
                    dp[i] += dp[i-2];
            }

        }
        return dp[n];
    }

}
