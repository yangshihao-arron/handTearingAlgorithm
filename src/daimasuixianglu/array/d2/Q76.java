package daimasuixianglu.array.d2;

public class Q76 {

    public String minWindow(String s, String t) {

        int[] need = new int[128];
        int left = 0, count = t.length(), start = 0, size = Integer.MAX_VALUE;

        for (int i = 0; i < t.length(); i++) {
            need[t.charAt(i)]++;
        }

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (need[c] > 0) {
                count--;
            }
            need[c]--;
            if (count == 0) {
                while(left < right && need[s.charAt(left)] < 0){
                    need[s.charAt(left)]++;
                    left++;

                }
                if(right - left + 1 < size){
                    size = right - left + 1;
                    start = left;
                }
                need[s.charAt(left)]++;
                left++;
                count++;
            }

        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String res = new Q76().minWindow(s, t);
        System.out.println(res);
    }
}
