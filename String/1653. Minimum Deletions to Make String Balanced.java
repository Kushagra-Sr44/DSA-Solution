//https://leetcode.com/problems/minimum-deletions-to-make-string-balanced
class Solution {
    public int minimumDeletions(String s) {
        int i = 0;
        int j = 0;
        int cb = 0;
        while (j < s.length()) {
            if (s.charAt(j) == 'b') {
                if (i <= j)
                    i = j + 1;
                else
                    i++;
                while (i < s.length()) {
                    if (s.charAt(i) == 'a')
                        break;
                    i++;
                }
                if (i == s.length())
                    break;
                else {
                    cb++;
                }
            }
            j++;
        }
        return cb;
    }
}
