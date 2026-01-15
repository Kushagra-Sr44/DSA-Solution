//https://leetcode.com/problems/maximize-area-of-square-hole-in-grid
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int i = 1;
        int x = 0;
        int k = 0;
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        while (i < hBars.length) {
            if (hBars[i] == hBars[i - 1] + 1)
                k++;
            else {
                x = Math.max(x, k);
                k = 0;
            }
            i++;
        }
        x = Math.max(x, k) + 2;
        i = 1;
        int y = 0;
        k = 0;
        while (i < vBars.length) {
            if (vBars[i] == vBars[i - 1] + 1) {
                k++;
            } else {
                y = Math.max(y, k);
                k = 0;
            }
            i++;
        }
        y = Math.max(y, k) + 2;
        return Math.min(x, y) * Math.min(x, y);
    }
}
