package y_2023.m5.week2.d5;

public class Q392 {

    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for(char c : s.toCharArray()){
            index = t.indexOf(c, index + 1);
            if(index == -1)
                return false;
        }
        return true;
    }

}
