class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int mindis=Integer.MAX_VALUE;
        for(int num:map.keySet()){
           int freq=map.get(num);
           if(freq>=3){
            int a=0, b=0, c=0;
            int count=0;
            for(int i=0;i<nums.length;i++){
               if(nums[i]==num){
                if(count==0) a=i;
                else if(count ==1)b=i;
                else if(count==2) c=i;
                else {
                    int dis=b-a+c-b+c-a;
                    mindis=Math.min(dis,mindis);
                    int newdis=c-b+i-c+i-b;
                        int t=b;
                        b=c;
                        a=t;
                        c=i;
                    
                }
                count ++;
               }
            }
            mindis=Math.min(b-a+c-b+c-a,mindis);
           }
        }
        if(mindis==Integer.MAX_VALUE) return -1;
        return mindis;

    }
}
