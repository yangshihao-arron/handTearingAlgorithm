package y_2023.m5.week2.d2;

public class Q408_2 {

    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        while (i < word.length() && j < abbr.length()) {
            char a1 = abbr.charAt(j);
            if ('0' <= a1 && a1 <= '9') {
                if (a1 == '0')
                    return false;
                int val = 0;
                while (j < abbr.length() && '0' <= abbr.charAt(j) && abbr.charAt(j) <= '9') {
                    val = val * 10 + abbr.charAt(j) - '0';
                    j++;
                }
                i += val;
            } else {
                if (word.charAt(i) != abbr.charAt(j))
                    return false;
                i++;
                j++;
            }
        }
        if(i == word.length() && j == abbr.length())
            return true;
        else
            return false;
    }


    public static void main(String[] args) {
        String word = "internationalization";
        String abbr = "i5a11o1";
        boolean res = new Q408_2().validWordAbbreviation(word, abbr);
        System.out.println(res);
    }
}
