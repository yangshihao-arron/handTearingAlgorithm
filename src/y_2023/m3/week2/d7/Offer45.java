package y_2023.m3.week2.d7;

public class Offer45 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, strs.length - 1);
        StringBuilder res = new StringBuilder();
        for(String s :strs)
            res.append(s);
        return res.toString();
    }
    void quickSort(String[] strs, int l, int r){

        if(l >= r) return;
        int i = l, j = r;
        String temp = strs[i];
        while(i < j) {
            while ((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) j--;
            while ((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j) i++;
            temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
        strs[i] = strs[l];//把strs[i]放到数据"中间"
        strs[l] = temp;
        quickSort(strs, l, i - 1);
        quickSort(strs, i + 1, r);
    }

}
