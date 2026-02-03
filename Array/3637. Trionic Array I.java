//https://leetcode.com/problems/trionic-array-i
class Solution {
    public boolean isTrionic(int[] nums) {
        int p=-1001;
        int q=-1001;
        int i=1;
        while(i<nums.length&&nums[i]>nums[i-1]){
            p=i;
            i++;
        }
         while(i<nums.length&&nums[i]<nums[i-1]){
            q=i;
            i++;
        }
        int z=-1001;
        while(i<nums.length&&nums[i]>nums[i-1]){
            z=i;
            i++;
        }
        if(p==-1001 || q==-1001|| z==-1001 || z!=nums.length-1) return false;
        return true;

        
    }
}
