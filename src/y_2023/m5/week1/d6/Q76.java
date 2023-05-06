package y_2023.m5.week1.d6;

public class Q76 {

    public String minWindow(String s, String t) {
        if(s == null || s.length() == 0 || t == null || t.length() == 0)
            return "";
        int[] need = new int[128];
        // 记录需要记录的个数
        for(int i = 0; i < t.length(); i++){
            need[t.charAt(i)]++;
        }

        //l是当前左边界，r是当前右边界，size记录窗口大小，count是需求的字符个数，start是最小覆盖串开始的index
        int l = 0, r = 0, size = Integer.MAX_VALUE, count = t.length(), start = 0;
        // 遍历所有字符
        while(r < s.length()){
            char c = s.charAt(r);
            if(need[c] > 0){
                count--;
            }
            need[c] --;
            if(count == 0){
                while(l < r && need[s.charAt(l)] < 0){
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
}
