//https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array
class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int st=400;
        int i=startIndex;
        int j=startIndex;
        int c=0;
        while(true){
         if(words[i].equals(target)||words[j].equals(target)) {
            return c;
         }
         c++;
         i=(i+1)%words.length;
         j=(j-1+words.length)%words.length;
         if(i==startIndex)break;
        }
        return -1;
         
    }
}
