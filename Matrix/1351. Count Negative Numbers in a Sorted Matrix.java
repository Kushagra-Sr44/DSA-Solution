//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix
class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int i=0;
        int j=n-1;
        int c=0;
        while(j>=0 && i<m){
            if(grid[i][j]<0){
                c+=m-i;
                j--;
            }
            else{
               i++;
            }
        }
        return c;
    }
}
