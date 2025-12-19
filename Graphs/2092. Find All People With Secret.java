//leetcode :https://leetcode.com/problems/find-all-people-with-secret
class Solution {
    class meet implements Comparable<meet>{
        int x;
        int y;
        int t;
        meet(int x,int y,int t){
            this.x=x;
            this.y=y;
            this.t=t;
        }
        @Override
        public int compareTo(meet m1){
            return this.t-m1.t;
        }
    }
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
       Set<Integer> ans=new HashSet<>();
       PriorityQueue<meet> pq=new PriorityQueue<>();
        for(int i=0;i<meetings.length;i++){
            pq.add(new meet(meetings[i][0],meetings[i][1],meetings[i][2]));
        }
        ans.add(0);
        ans.add(firstPerson);
      int currt=pq.peek().t;
Map<Integer,List<Integer>> map=new HashMap<>();
        while(!pq.isEmpty()){
            int x=pq.peek().x;
            int y=pq.peek().y;
            int t=pq.peek().t;
           if(currt==t){
            map.putIfAbsent(x,new ArrayList<>());
             map.get(x).add(y);
            
            map.putIfAbsent(y,new ArrayList<>());
            map.get(y).add(x);
        
           }
           else{
            for(int u:map.keySet()){
                if(ans.contains(u)) ans.addAll(map.get(u));
            }
            for(int u:map.keySet()){
                if(ans.contains(u)) ans.addAll(map.get(u));
            }
             map=new HashMap<>();
              map.putIfAbsent(x,new ArrayList<>());
             map.get(x).add(y);
            map.putIfAbsent(y,new ArrayList<>());
            map.get(y).add(x);
            currt=t;

           }
            if(ans.contains(x)){
                ans.add(y);
            }
            else if(ans.contains(y)){
                ans.add(x);
            } 
            pq.poll();
        
        }
        for(int u:map.keySet()){
                if(ans.contains(u)) ans.addAll(map.get(u));
            }
            for(int u:map.keySet()){
                if(ans.contains(u)) ans.addAll(map.get(u));
            }
        
        return new ArrayList<Integer>(ans);
    }
}
