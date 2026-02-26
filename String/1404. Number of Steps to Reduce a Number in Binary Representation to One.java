//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one
class Solution {
    public int numSteps(String s) {
        StringBuilder sb=new StringBuilder(s);
        int c=0;
        while(sb.length()!=1){
            int n=sb.length()-1;
            if(sb.charAt(n)=='1'){
                boolean ch=true;
                for(int i=n;i>=0;i--){
                    if(sb.charAt(i)=='0'){
                     sb.setCharAt(i,'1');
                     ch=false;
                     break;
                    }
                   else sb.setCharAt(i,'0');
                }
                if(ch) sb.insert(0,'1');
            }
            else sb.deleteCharAt(n);
            c++;
        }
        return c;
    }
}
