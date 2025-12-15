//leetcode link: https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock
class Solution {
    public long getDescentPeriods(int[] prices) {
        long d=prices.length;
        for(int i=0;i<prices.length;i++){
            int j=i+1;
            int c=0;
            while(j<prices.length&&prices[i]-1-c==prices[j]){
                c++;
                j++;
                d+=c;
            }
           i=j-1;
        }
        return d;
    }
}
