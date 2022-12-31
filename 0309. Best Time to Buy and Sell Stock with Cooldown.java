class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int no_stock = 0,in_hold = -prices[0],sold = 0;
        int prev_ns = no_stock;
        for(int i=1;i<n;i++)
        {
            no_stock = Math.max(no_stock,sold);
            sold = prices[i]+in_hold;
            in_hold = Math.max(in_hold,(prev_ns-prices[i]));
            // System.out.println(no_stock+" "+in_hold+" "+sold);
            prev_ns = no_stock;
        }
        return Math.max(sold,no_stock);
    }
}
TC = O(N)
SC = O(1)  
=======================DP===============================

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int dp[][] = new int[n][3];
        dp[0][1] = -prices[0];
        for(int i=1;i<n;i++)
        {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][2]);
            dp[i][1] = Math.max(dp[i-1][1],(dp[i-1][0]-prices[i]));
            dp[i][2] = prices[i]+dp[i-1][1];
            System.out.println(dp[i][0]+" "+dp[i][1]+" "+dp[i][2]);
        }
        return Math.max(dp[n-1][0],dp[n-1][2]);
    }
}

TC = O(N)
SC = O(N)  
