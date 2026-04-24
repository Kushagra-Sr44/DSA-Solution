//https://leetcode.com/problems/furthest-point-from-origin
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int x=0;
        int dis=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='_') x++;
            else if(c=='R') dis++;
            else dis--;
        }
        return Math.abs(dis)+x;
    }
}
