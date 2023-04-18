package y_2023.m4.week3.d2;

public class Q209 {

    public String minWindow(String s, String t) {

        if (s == null || s.length() == 0 || t == null || t.length() == 0){
            return "";
        }
        int[] need = new int[128];
        //记录需要的字符的个数
        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }
        //l是当前左边界，r是当前右边界，size记录窗口大小，count是需求的字符个数，start是最小覆盖串开始的index
        int l = 0, r = 0, size = Integer.MAX_VALUE, count = t.length(), start = 0;
        // 遍历所有字符
        while(r < s.length()){
            char c = s.charAt(r);
            if(need[c] > 0){
                count --;
            }
            need[c] --;
            if(count == 0){
                while(l < r && need[s.charAt(l)] < 0) {
                    need[s.charAt(l)]++;
                    l++;
                }
                if(r - l + 1 < size){
                    size = r - l + 1;
                    start = l;
                }
                need[s.charAt(l)]++;
                l++;
                count++;
            }
            r++;

        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);

    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = new Q209().minWindow(s, t);
        System.out.println(res);
    }

}
