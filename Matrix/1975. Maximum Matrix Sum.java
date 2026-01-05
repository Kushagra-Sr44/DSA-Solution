//https://leetcode.com/problems/maximum-matrix-sum
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int c=0;
        int min=100001;
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]<0){
                c++;
            }
            min=Math.min(min,Math.abs(matrix[i][j]));
            sum+=Math.abs(matrix[i][j]);
        }
       } 
       if(c%2==0)return sum;
       return sum-min-min;
    }
}
