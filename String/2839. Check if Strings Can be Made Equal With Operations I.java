class Solution {
    public boolean canBeEqual(String s1, String s2) {
        for(int i=0;i<s1.length();i++){
            boolean ch=false;
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                 if(Math.abs(j-i)%2==0){
                    ch=true;
                    break;
                 }
                }
            }
            if(!ch) return false;
        }
        return true;
    }
}
