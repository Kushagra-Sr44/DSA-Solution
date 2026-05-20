// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int idx[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            idx[A[i]-1]=i;
        }
         int prefix[]=new int [A.length];
         for(int i=0;i<A.length;i++){
            int j=idx[B[i]-1];
            j=Math.max(j,i);
            prefix[j]++;
            if(i!=0){
                prefix[i]+=prefix[i-1];
            }
         }
         return prefix;
    }
}
