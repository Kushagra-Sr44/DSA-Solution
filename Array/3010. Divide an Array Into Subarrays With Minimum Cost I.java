//https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i
class Solution {
    public int minimumCost(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                min = Math.min(min, nums[i] + nums[j]);
            }
        }
        return min + nums[0];
    }
}
