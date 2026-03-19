//https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y
class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int[][] freq = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int x = 1000001;
                if (grid[i][j] == 'X')
                    x = 1;
                else if (grid[i][j] == 'Y')
                    x = -1;
                freq[i][j] = x;
                if (j != 0) {
                    if (freq[i][j - 1] != 1000001) {
                        if (x == 1000001)
                            freq[i][j] = freq[i][j - 1];
                        else
                            freq[i][j] += freq[i][j - 1];
                    }
                }
            }
            if (i != 0) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (freq[i - 1][j] != 1000001) {
                        if (freq[i][j] == 1000001)
                            freq[i][j] = freq[i - 1][j];
                        else
                            freq[i][j] += freq[i - 1][j];
                    }
                }
            }

        }
        int c = 0;
        boolean ch = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 'X')
                    ch = true;

                if (ch&&freq[i][j] == 0)
                    c++;
            }
        }
        return c;
    }
}
