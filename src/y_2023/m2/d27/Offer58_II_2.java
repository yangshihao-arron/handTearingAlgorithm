package y_2023.m2.d27;

public class Offer58_II_2 {
    public String reverseLeftWords(String s, int n) {
        String res  = "";
        for (int i = n; i < n + s.length() ; i++) {
            res += s.charAt(i % s.length());
        }
        return res;
    }

}
