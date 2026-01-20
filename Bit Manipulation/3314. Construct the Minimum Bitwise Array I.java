//https://leetcode.com/problems/construct-the-minimum-bitwise-array-i
class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int []ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int k=nums.get(i);
            if(k%2==0) ans[i]=-1;
            else{
                int j=k-1;
                int a=j;
                while(j>=0){
                    int o=j|j+1;
                   if(o==k) a=j;
                   j--;
                }
                ans[i]=a;
            }
        }
        return ans;
    }
}
