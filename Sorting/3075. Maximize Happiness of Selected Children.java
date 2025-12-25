// https://leetcode.com/problems/maximize-happiness-of-selected-children
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int n=happiness.length;
        for(int i=n-1;i>=n-k;i--){
            if(happiness[i]<=n-i-1) sum+=0;
            else  sum+=happiness[i]-n+i+1;
        }
        return sum;
    }
}
