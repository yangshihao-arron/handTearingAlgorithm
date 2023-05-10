package the_essential_version_of_the_interview.a1_10;

public class Q6 {
    public String reverseWords(String s) {
        s = s.trim();
        String[] ss = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = ss.length - 1; i > 0; i--){
            sb.append(ss[i] + " ");
        }
        sb.append(ss[0]);
        return sb.toString();
    }
}
