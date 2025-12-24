// https://leetcode.com/problems/apple-redistribution-into-boxes
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
      int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        Arrays.sort(capacity);
        int i=capacity.length-1;
        while(sum>0){
         sum-=capacity[i];
         i--;
        }
        return capacity.length-i-1;
    }
}
