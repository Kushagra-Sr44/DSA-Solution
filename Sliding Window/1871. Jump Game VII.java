// https://leetcode.com/problems/jump-game-vii
class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (n == 1)
            return true;
        if (s.charAt(n - 1) == '1')
            return false;
        int vis[] = new int[n];
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        vis[0] = 1;
        int far = 0;
        while (!que.isEmpty()) {
            int i = que.remove();
            int st = Math.max(i + minJump, far + 1);
            int end = Math.min(i + maxJump, n - 1);
            for (int j = st; j <= end; j++) {
                if (s.charAt(j) == '0' && vis[j] == 0) {
                    if (j == n - 1)
                        return true;
                    vis[j] = 1;
                    que.add(j);
                }
            }
            far =  i + maxJump;

        }
        return false;
    }
}
