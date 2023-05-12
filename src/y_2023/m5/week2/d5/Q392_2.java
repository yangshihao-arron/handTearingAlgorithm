package y_2023.m5.week2.d5;

public class Q392_2 {
    public boolean isSubsequence(String s, String t) {
       int sn = s.length(), tn = t.length();
       int i = 0, j = 0;
       while (i < sn && j < tn){
           if(s.charAt(i) == t.charAt(j)){
               i++;
           }
           j++;
       }
       return i == sn;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean res = new Q392_2().isSubsequence(s, t);
        System.out.println(res);
    }
}
