//https://leetcode.com/problems/maximum-distance-between-a-pair-of-values
class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int maxdis=0;
        while(i<nums1.length&& j<nums2.length){
            while(j<nums2.length &&nums1[i]<=nums2[j]){
                maxdis=Math.max(maxdis,j-i);
                j++;
            }
            i++;
            j++;

        }
        return maxdis;
    }
}
