//https://leetcode.com/problems/find-the-largest-area-of-square-inside-two-rectangles
class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long s = 0;
        for (int i = 0; i < bottomLeft.length; i++) {
            for (int j = i +1; j < bottomLeft.length; j++) {
              int x1=Math.max(bottomLeft[i][0],bottomLeft[j][0]);
              int y1=Math.max(bottomLeft[i][1],bottomLeft[j][1]);
              int x2=Math.min(topRight[i][0],topRight[j][0]);
              int y2=Math.min(topRight[i][1],topRight[j][1]);
              if(x1<x2 && y1<y2){
                s=Math.max(s,Math.min(x2-x1,y2-y1));
                }
        }}
        return s * s;
    }
}
