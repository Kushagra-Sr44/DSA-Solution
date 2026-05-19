// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero
class Solution {
    public int minReorder(int n, int[][] connections) {
        List<int[]> []adjlist=new ArrayList[n];
        for(int i=0;i<n;i++){
            adjlist[i]=new ArrayList<>();
        }
        for(int i=0;i<n-1;i++){
        int u=connections[i][0];
        int v=connections[i][1];    
        adjlist[u].add(new int[]{v,1});
          adjlist[v].add(new int[]{u,0});
        }
        int vis[]=new int[n];
        Queue<Integer> que=new LinkedList<>();
        que.add(0);
        vis[0]=1;
        int e=0;
        while(!que.isEmpty()){
            int x=que.remove();
            for(int[] l:adjlist[x]){
                int u=l[0];
                int k=l[1];
               if(vis[u]==0){
                que.add(u);
                vis[u]=1;
                e+=k;
               }
            }
        }
        return e;
    }
}
