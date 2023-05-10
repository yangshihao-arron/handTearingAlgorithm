package the_essential_version_of_the_interview.a1_10;

public class Q5_2 {

    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int l = 0, r = n - 1;
        while(l < r){
            while(l < r && !isVowel(arr[l])){
                l++;
            }
            while(l < r && !isVowel(arr[r])){
                r--;
            }
            if(l < r){
                swap(arr, l, r);
                l++;
                r--;
            }

        }
        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }

    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String s = "hello";
        String res = new Q5_2().reverseVowels(s);
        System.out.println(res);
    }

}
