class Scratch {
    public static void main(String[] args) {
        
    }
}

public int maxProfit(int[] prices) {
    int l = 0, r = 1;
    int maxP = 0;
    while (r < prices.length) {
        if (prices[l] < prices[r]) {
            int profit = prices[r] - prices[l];
            maxP =  Math.max(maxP, profit);
        } else {
            l = r;
        }
        r += 1;
    }
    return maxP;
}