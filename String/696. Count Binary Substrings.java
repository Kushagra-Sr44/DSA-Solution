//https://leetcode.com/problems/count-binary-substrings
class Solution {
    public int countBinarySubstrings(String s) {
        int i = 0;
        int sum = 0;
        int k = 0;
        int p = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '0') {
                while (i < s.length() && s.charAt(i) == '0') {
                    k++;
                    i++;
                }
                sum += Math.min(p, k) ;
                p=0;
            } else {
                while (i < s.length() && s.charAt(i) == '1') {
                    p++;
                    i++;
                }
                sum += Math.min(p, k) ;
                k=0;
            }
           
        }
        return sum;
    }
}
