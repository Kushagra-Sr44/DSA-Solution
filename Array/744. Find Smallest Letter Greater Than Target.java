//https://leetcode.com/problems/find-smallest-letter-greater-than-target
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      char ch=letters[0];
      int i=1;
      while(i<letters.length && ch<=target)  {
        ch=letters[i];
          i++;
      }
      return (ch>target)?ch:letters[0];
    }
}
