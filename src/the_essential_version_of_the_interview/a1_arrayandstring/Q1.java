package the_essential_version_of_the_interview.a1_arrayandstring;

public class Q1 {

    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder res = new StringBuilder();
        while(i < len1 && j < len2){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        if(i < len1)
            res.append(word1.substring(i));
        if(j < len2)
            res.append(word2.substring(j));
        return res.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String res = new Q1().mergeAlternately(word1, word2);
        System.out.println(res);
    }

}
