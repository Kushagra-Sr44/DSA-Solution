// https://leetcode.com/problems/magic-squares-in-grid
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
            if(check(grid,i,j)) count++;
            }
        }
        return count;
        
    }
    public boolean check(int grid[][],int m,int n){
       int num[]=new int[9];
        for(int i=m;i<m+3;i++){
            for(int j=n;j<n+3;j++){
              if(grid[i][j]>0 &&grid[i][j]<10&&num[grid[i][j]-1]== 0){
                num[grid[i][j]-1]=1;
              }
              else return false;  
            }
        }
        for(int i=m;i<m+3;i++){
           if(grid[i][n]+grid[i][n+1]+grid[i][n+2]!=15) return false;
        }
        for(int i=n;i<n+3;i++){
           if(grid[m][i]+grid[m+1][i]+grid[m+2][i]!=15) return false;
        }
        if(!(grid[m][n]+grid[m+1][n+1]+grid[m+2][n+2]==15 && grid[m][n+2]+grid[m+1][n+1]+grid[m+2][n]==15))
        return false; 
        
return true;

    }
}
