package the_essential_version_of_the_interview.a1_10;

public class Q2 {

    public String gcdOfStrings(String str1, String str2) {
       int len1 = str1.length(), len2 = str2.length();
       for(int i = Math.min(len1,len2); i >= 1; i--){
           if(len1 % i == 0 && len2 % i==0){
               String X = str1.substring(0, i);
               if(check(X,str1) && check(X, str2))
                   return X;
           }
       }
        return "";
    }

    public boolean check(String t, String s){
        int lenx = s.length() / t.length();
        StringBuilder res = new StringBuilder();
        for(int i = 1; i <= lenx; i++){
            res.append(t);
        }
        return s.equals(res.toString());
    }

    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        String res = new Q2().gcdOfStrings(str1, str2);
        System.out.println(res);
    }

}
