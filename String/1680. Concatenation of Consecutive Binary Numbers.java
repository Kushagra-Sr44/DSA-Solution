//https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers
class Solution {
    public int concatenatedBinary(int n) {
        long ans=0;
        long mul=1;
        int d=1000000007;
        for(int i=n;i>0;i--){
            ans+=(i*mul)%d;
            ans=ans%d;
            mul*=(Math.pow(2,Integer.toBinaryString(i).length()))%d;
            mul=mul%d;
        }
        return (int)ans;
    }
}
