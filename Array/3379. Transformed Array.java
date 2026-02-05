//https://leetcode.com/problems/transformed-array
class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                result[i]=nums[(i-(Math.abs(nums[i])%n)+n)%n];
            }
          else result[i]=nums[(i+nums[i]+n)%n];
        }
        return result;
    }
}
