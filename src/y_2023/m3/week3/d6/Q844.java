package y_2023.m3.week3.d6;

public class Q844 {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String str){
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        for(int i = 0; i < len; i++){
            char c = str.charAt(i);
            if(c != '#')
                sb.append(c);
            else{
                if(sb.length() > 0){
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        StringBuilder sb = new StringBuilder();
        boolean res = new Q844().backspaceCompare(s,t);
        System.out.println();
    }
}
