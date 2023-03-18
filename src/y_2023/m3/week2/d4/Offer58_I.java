package y_2023.m3.week2.d4;

public class Offer58_I {
    public String reverseWords(String s) {
        s = s.trim();
        String[] res = s.split("\\s+");
        int n = res.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i > 0; i--) {
            sb.append(res[i] + " ");
        }
        sb.append(res[0]);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        String res = new Offer58_I_2().reverseWords(s);
        System.out.println();
        System.out.println(res);
    }
}
