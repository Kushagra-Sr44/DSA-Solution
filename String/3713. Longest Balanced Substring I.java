//https://leetcode.com/problems/longest-balanced-substring-i
class Solution {
    public int longestBalanced(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] arr = new int[26];
int j=i;

            for (; j < s.length(); j++) {
                int a = s.charAt(j) - 'a';
                arr[a]++;
                 int p = 0;
            boolean ch = true;
            if(i!=j){}
            for (int k = 0; k < 26; k++) {
                if (arr[k] != 0) {
                    if (p == 0)
                        p = arr[k];
                    else if (p != arr[k]) {
                        ch = false;
                        break;
                    }
                }
            }
            if (ch)
                max = Math.max(max, j - i + 1);

        }
            }
           
        return max;
    }
}
