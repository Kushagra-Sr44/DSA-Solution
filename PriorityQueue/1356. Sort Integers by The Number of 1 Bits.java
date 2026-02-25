// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits
class Solution {
    class obj implements Comparable<obj>{
        int val;
        int one;
        obj(int v,int o){
            this.val=v;
            this.one=o;
        }
        @Override 
        public int compareTo(obj o1){
            if(this.one==o1.one)return this.val-o1.val;
            else return this.one-o1.one;
        }
    }
    public int[] sortByBits(int[] arr) {
        PriorityQueue<obj> que=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
           que.add(new obj(arr[i],count(arr[i])));
        }
         for(int i=0;i<arr.length;i++){
           arr[i]=que.remove().val;
        }
        return arr;

        
    }
    public int count(int n){
        int c=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')c++;
        }
        return c;
    }
}
