//https://leetcode.com/problems/minimum-absolute-difference-in-sliding-submatrix
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int[][] ans = new int[grid.length - k +1][grid[0].length+1-k ];
        for (int i = 0; i <= grid.length - k; i++) {
            for (int j = 0; j <= grid[0].length - k; j++) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int x = i; x <i + k; x++) {
                    for (int y = j; y < j + k; y++) {
                        if (!list.contains(grid[x][y])) {
                            list.add(grid[x][y]);
                        }
                    }
                }
                int z = mindiff(list);
                ans[i][j] = z;
            }
        }
        return ans;

    }

    public int mindiff(ArrayList<Integer> li) {
        if (li.size() == 1)
            return 0;
        Collections.sort(li);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < li.size() - 1; i++) {
            min = Math.min(li.get(i + 1) - li.get(i), min);
        }
        return min;
    }
}
