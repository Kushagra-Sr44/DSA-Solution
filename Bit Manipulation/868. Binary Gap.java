//https://leetcode.com/problems/binary-gap
class Solution {
    public int binaryGap(int n) {
        String st=Integer.toBinaryString(n);
        int i=-1;
        int maxd=0;
        for(int j=0;j<st.length();j++){
            if(st.charAt(j)=='1'){
                if(i==-1){
                    i=j;
                }
                else{
                    maxd=Math.max(maxd,j-i);
                    i=j;
                }
            }
        }
        return maxd;
    }
}
