//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones

class Solution {
    public boolean checkOnesSegment(String s) {
        boolean ch=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0') ch=true;
            if(ch&& c=='1') return false;
        }
        return true;
    }
}
