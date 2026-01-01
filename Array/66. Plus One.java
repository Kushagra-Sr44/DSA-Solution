//https://leetcode.com/problems/plus-one
class Solution {
    public int[] plusOne(int[] digits) {
        boolean ch=true;
        int j=digits.length-1;
        for(int i=digits.length-1;i>=0;i--){
          if(digits[i]<9) {
            ch= false;
            j=i;
             break;
             }
        }
        if(ch) {
            int newarr[]=new int[digits.length+1];
            newarr[0]=1;
            return newarr;
        }
        else{
            digits[j]+=1;
            for(int i=digits.length-1;i>j;i--){
                digits[i]=0;
            }
        }
        return digits;
    }
}
