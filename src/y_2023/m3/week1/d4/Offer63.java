package y_2023.m3.week1.d4;

public class Offer63 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0 || n == 1)
            return 0;
        int minPrice = prices[0];
        int max = 0;
        for(int i = 1; i < n; i++){
            if(minPrice < prices[i])
                max = Math.max(max, prices[i] - minPrice);
            else
                minPrice = prices[i];
        }
        return max;
    }
}
