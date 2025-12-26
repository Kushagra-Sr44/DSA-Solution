//https://leetcode.com/problems/minimum-penalty-for-a-shop
class Solution {
    public int bestClosingTime(String customers) {
      
        int pos=0;
        int p=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y') p++;
        }
          int minp=p;
          for(int i=1;i<=customers.length();i++){
            if(customers.charAt(i-1)=='Y') p--;
            else p++;
            if(minp>p){
                minp=p;
                pos=i;
            }
          }
          return pos;
    
    }
}
