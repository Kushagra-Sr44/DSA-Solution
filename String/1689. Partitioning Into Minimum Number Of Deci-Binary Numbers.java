//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers
class Solution {
    public int minPartitions(String n) {
    int max=0;
    for(int i=0;i<n.length();i++){
        if(max==9) return max;
        int k=n.charAt(i)-'0';
          max=Math.max(max,k);
    }
    return max;
    }
}
