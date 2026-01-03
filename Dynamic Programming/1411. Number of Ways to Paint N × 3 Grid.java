// https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid
class Solution {
    public int numOfWays(int n) {
        long a=6;
        long b=6;
        int mod=1000000007;
        for(int i=1;i<n;i++){
            long na=((a*3)+(b*2))%mod;
            long nb=((a*2)+(b*2))%mod;
           a=na;
           b=nb;
        }
        return (int )((a+b)%mod);
    }
}
