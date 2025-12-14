// leetcode link : https://leetcode.com/problems/number-of-ways-to-divide-a-long-corridor
class Solution {
    public int numberOfWays(String corridor) {
        long ans = 1;
        int countseat = 0;
        int mod = 1000000007;
        int lastseat = -1;
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                countseat++;
                if (countseat == 1 && lastseat != -1) {
                    ans = (ans * (i - lastseat)) % mod;
                }
                if (countseat == 2) {
                    lastseat = i;
                    countseat = 0;
                }
            }
        }
        if (countseat ==1 || lastseat==-1) return 0;
        return (int) ans;

    }
}
