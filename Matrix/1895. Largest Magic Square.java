//https://leetcode.com/problems/largest-magic-square

class Solution {
    public int largestMagicSquare(int[][] grid) {
        int max = 1;
        int c = Math.min(grid[0].length, grid.length);
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                int k = 1;
                while (j + k < grid[0].length && i+k< grid.length) {
                    if (check(grid, i, j, k))
                        max = Math.max(max, k + 1);
                    k++;
                }

            }
        }
        return max;
    }

    public boolean check(int[][] grid, int i, int j, int k) {
        int row[] = new int[k + 1];
        int col[] = new int[k + 1];
        int dia1 = 0;
        int dia2 = 0;
        for (int x = i; x <= i + k; x++) {
            for (int y = j; y <= j + k; y++) {
                col[y - j] += grid[x][y];
                row[x - i] += grid[x][y];
            }
        }
        for (int x = 0; x <= k; x++) {
            dia1 += grid[i + x][j + x];
        }
        for (int x = 0; x <= k; x++) {
            dia2 += grid[i + x][j + k - x];
        }
        if (dia1 != dia2)
            return false;
        for (int x = 0; x < k + 1; x++) {
            if (row[x] != dia1)
                return false;
            if (col[x] != dia2)
                return false;
        }
        return true;
    }
}
