// https://leetcode.com/problems/number-of-ways-to-assign-edge-weights-i/
class Solution {
    public int power(int val,int p){
        int ans=1;
          int  mod=1000000007;
        for(int i=0;i<p;i++){
            ans=(ans*val)%mod;
        }
        return ans;
    }
    public int assignEdgeWeights(int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <=edges.length; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0] - 1;
            int v = edges[i][1] - 1;
            list.get(u).add(v);
            list.get(v).add(u);

        }
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        int len = -1;
        int vis[]=new int[edges.length+1];
        vis[0]=1;
        while (!que.isEmpty()) {
            int n = que.size();
            for (int i = 0; i < n; i++) {
                int u = que.remove();
                for (int v : list.get(u)) {
                    if(vis[v]==0){
                    que.add(v);
                   vis[v]=1;
                    }
                }
            }
            len++;
        }        
        return power(2,len-1);

    }
}
