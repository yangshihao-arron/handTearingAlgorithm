package y_2023.m3.week2.d1;

public class Offer46 {
    public int translateNum(int num) {
         String s = String.valueOf(num);
         int n = s.length();
         int[] f = new int[n + 1];
         f[0] = 1;
         for(int i = 1 ; i <= n; i++){
             f[i] = f[i - 1]; //单独翻译s[i]
             if(i > 1){
                 int t = (s.charAt(i - 2)-'0') * 10 + (s.charAt(i-1) - '0');
                 if(t >= 10 && t <= 25)
                     f[i] += f[i - 2];
             }
         }
         return f[n];
    }
}
