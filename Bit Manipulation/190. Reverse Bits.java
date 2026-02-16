//https://leetcode.com/problems/reverse-bits
class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        int i = 0;
        int mul = (int) Math.pow(2, 32 - s.length());
        int sum = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '1') {
                sum += mul;
            }
            mul *= 2;
            i++;
        }
        return sum;
    }
}
