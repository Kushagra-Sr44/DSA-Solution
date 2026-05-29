// https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum
class Solution {
    public int minElement(int[] nums) {
        int ans=10001;
        for(int i=0;i<nums.length;i++){
            int s=0;
            int num=nums[i];
            while(num!=0){
                s=s+num%10;
                num/=10;
            }
            ans=Math.min(ans,s);
        }
        return ans;
    }
}
