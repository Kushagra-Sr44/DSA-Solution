//https://leetcode.com/problems/binary-number-with-alternating-bits
class Solution {
    public boolean hasAlternatingBits(int n) {
        String st=Integer.toBinaryString(n);
        for(int i=0;i<st.length()-1;i++){
            if(st.charAt(i)==st.charAt(i+1)) return false;
        }
        return true;
    }
}
