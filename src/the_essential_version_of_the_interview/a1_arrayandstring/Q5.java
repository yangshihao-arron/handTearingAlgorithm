package the_essential_version_of_the_interview.a1_arrayandstring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q5 {

    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        String vowel = "aeiouAEIOU";
        for(int i = 0; i < vowel.length(); i++)
            set.add(vowel.charAt(i));
        List<Integer> vowelIndexs = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i)))
                vowelIndexs.add(i);
        }
        int l = 0, r = vowelIndexs.size() - 1;
        char[] res = s.toCharArray();
        for(int i =  1; i <= vowelIndexs.size() / 2; i++){
            char pre = res[vowelIndexs.get(l)];
            res[vowelIndexs.get(l)] = res[vowelIndexs.get(r)];
            res[vowelIndexs.get(r)] = pre;
            l++;
            r--;
        }
        return new String(res);

    }

    public static void main(String[] args) {
        String s = "leetcode";
        String res = new Q5().reverseVowels(s);
        System.out.println(res);
    }

}
