//https://leetcode.com/problems/subarray-product-less-than-k
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==1|| k==0) return 0;
        int i = 0;
        int j = 0;
        long pr = 1;
        int c = 0;
        while (j < nums.length) {
            pr *= nums[j];
            while (i < nums.length && pr >= k) {
                pr /= nums[i];
                i++;
            }
            if (pr < k) {
                c += j - i + 1;
            }
            j++;
        }
        return c;

    }
}
