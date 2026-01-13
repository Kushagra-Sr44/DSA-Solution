//https://leetcode.com/problems/climbing-stairs
class Solution {
    public int climbStairs(int n) {
        int memo[]=new int[n+1];
    return rec(n,0,memo);
    }
    public int rec(int n,int k,int memo[]) {
        if(k>n) return 0;
    if(n==k) return 1;
    if(memo[k]!=0) return memo[k];
   memo[k]=rec(n,k+1,memo)+rec(n,k+2,memo);
    return memo[k];
    }


}
