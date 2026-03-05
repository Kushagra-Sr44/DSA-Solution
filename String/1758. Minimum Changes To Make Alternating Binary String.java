//https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string
class Solution {
    public int minOperations(String s) {
        char x=s.charAt(0);
        int c=0;
        int k=0;
        for(int i=0;i<s.length();i++){
            char z=s.charAt(i);
            if(i%2==0) {
                if(z==x)c++;
                else k++;
            }
            else{
                if(z!=x)c++;
                else k++;
            }
        }
        return Math.min(c,k);
    }
}
