package y_2023.m2.d27;

public class Offer58_II {

    public String reverseLeftWords(String s, int n) {
        if(s == null || s.length()==1 || s.length() < n)
            return s;
        return s.substring(n) + s.substring(0, n);
    }

    public static void main(String[] args) {
        String s = "abcdef";
        String res = s.substring(2) + s.substring(0, 2);
        System.out.println(res);
    }

}
