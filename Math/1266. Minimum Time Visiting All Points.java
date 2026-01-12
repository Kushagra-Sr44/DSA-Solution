//https://leetcode.com/problems/minimum-time-visiting-all-points
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int mintime=0;
        int x=points[0][0];
        int y=points[0][1];
        for(int i=1;i<points.length;i++ ){
            mintime+=
            Math.max(Math.abs(points[i][0]-x),Math.abs(points[i][1]-y));
            x=points[i][0];
            y=points[i][1];
        }
        return mintime;
    }
}
