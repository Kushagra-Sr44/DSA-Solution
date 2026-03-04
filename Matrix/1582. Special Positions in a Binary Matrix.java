//https://leetcode.com/problems/special-positions-in-a-binary-matrix
class Solution {
    public int numSpecial(int[][] mat) {
        int c = 0;
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && check(mat, i, j))
                    c++;
            }
        }
        return c;

    }

    public boolean check(int[][] mat, int i, int j) {
        for (int x = 0; x < mat.length; x++) {
            if (x != i && mat[x][j] == 1)
                return false;
        }
        for (int x = 0; x < mat[0].length; x++) {
            if (x != j && mat[i][x] == 1)
                return false;
        }
        return true;
    }
}
