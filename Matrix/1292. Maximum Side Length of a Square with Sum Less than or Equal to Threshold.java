// https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold
class Solution {
    public int maxSideLength(int[][] mat, int threshold) {
        for(int i=0;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                mat[i][j]+=mat[i][j-1];
            }
        }
        int maxlen=0;
        int c=Math.min(mat[0].length,mat.length);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               int k=0;
               while(i+k<mat.length&&j+k<mat[0].length){
                 if(sum(mat,i,j,k)<=threshold){
                    if(k+1==c) return c;
                    else maxlen=Math.max(maxlen,k+1);
                    k++;
                 }
                 else break;
               }
            }
        }
        return maxlen;
    }
    public int sum(int grid[][],int x,int y,int z){
        int s=0;
        for(int i=x;i<=x+z;i++){
            if(y==0){
               s=s+grid[i][y+z];
            }
            else{
            s=s+grid[i][y+z]-grid[i][y-1];

            }
        }
        return s;
    }
}
