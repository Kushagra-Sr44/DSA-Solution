// leetcode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-using-strategy
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        long right = 0;
        int n = prices.length;
        long[] presum = new long[n];
        long mid = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
                if (i < k &&i >= k / 2)  mid += prices[i] ;      
            right += prices[i] * strategy[i];
            presum[i] = right;
        }
        ans = Math.max(right, mid + presum[n - 1] - presum[k - 1]);
        for (int i = k; i < n; i++) {
            mid += prices[i] - prices[i - k/2];
            ans = Math.max(ans, mid + presum[n - 1] - presum[i] + presum[i - k]);
        }
        return ans;
    }
}
