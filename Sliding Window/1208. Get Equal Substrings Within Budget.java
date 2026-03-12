//https://leetcode.com/problems/get-equal-substrings-within-budget
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
       int i=0;
       int j=0;
       int len=0;
       int sum=0;
       int l=0;
       while(j<s.length()){
        char cs=s.charAt(j);
        char ct=t.charAt(j);
        sum+=Math.abs((int)(cs-ct));
        if(sum>maxCost){
            sum=sum-Math.abs((int)(s.charAt(i)-t.charAt(i)));
            i++;
        }
        if(sum<=maxCost){
            len=Math.max(len,j-i+1);
        }
        j++;
       }
       return len;
    }
}
