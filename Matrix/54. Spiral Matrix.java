// https://leetcode.com/problems/spiral-matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list =new ArrayList<>();
        int rs=0;
        int cs=0;
        int ce=matrix[0].length-1;
        int re=matrix.length-1;
        int c=0;
        int k=(ce+1)*(re+1);
        while(c!=k){
            for(int i=cs;i<=ce;i++){
                list.add(matrix[rs][i]);
                c++;
            }
            if(c==k) break;
            rs++;
            for(int i=rs;i<=re;i++){
                list.add(matrix[i][ce]);
                c++;
            }
             if(c==k) break;
            ce--;
            for(int i=ce;i>=cs;i--){
                list.add(matrix[re][i]);
                c++;
            }
             if(c==k) break;
            re--;
            for(int i=re;i>=rs;i--){
                list.add(matrix[i][cs]);
                c++;
            }
             if(c==k) break;
            cs++;


        }
        return list;
    }
}

