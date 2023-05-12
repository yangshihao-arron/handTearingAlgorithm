package the_essential_version_of_the_interview.a1_arrayandstring;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i = 1; i < candies.length; i++){
            if(max < candies[i])
                max = candies[i];
        }
        List<Boolean> res = new ArrayList<>();
        for(int candie : candies){
            if(candie + extraCandies >= max)
                res.add(Boolean.TRUE);
            else
                res.add(Boolean.FALSE);
        }
        return res;
    }

    public static void main(String[] args) {
       int[] candies = {2,3,5,1,3};
       int extra = 3;
       new Q3().kidsWithCandies(candies, extra);
    }

}
