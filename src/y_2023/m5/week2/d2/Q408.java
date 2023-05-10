package y_2023.m5.week2.d2;

public class Q408 {

    // 官方题解
    public boolean validWordAbbreviation(String word, String abbr) {
        int abbrLen = abbr.length(), wordLen = word.length();
        int len = 0, num = 0;
        for (int i = 0; i < abbrLen; ++i) {
            if (abbr.charAt(i) >= 'a' && abbr.charAt(i) <= 'z') {
                len += num + 1;
                num = 0;
                if (len > wordLen || abbr.charAt(i) != word.charAt(len - 1)) return false;
            } else {
                if (num == 0 && abbr.charAt(i) == '0') return false; // 不能出现前导零
                num = num * 10 + abbr.charAt(i) - '0';
            }
        }
        return len + num == wordLen;
    }


    public static void main(String[] args) {
        String word = "internationalization";
        String abbr = "i5a11o1";
        boolean res = new Q408().validWordAbbreviation(word, abbr);
        System.out.println(res);
    }
}
