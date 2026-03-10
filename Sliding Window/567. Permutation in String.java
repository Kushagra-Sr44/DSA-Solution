//https://leetcode.com/problems/permutation-in-string
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int k=map.size();
        
        int i = 0;
        int j = 0;
        int n = 0;
        char c;
        while (j < s2.length()) {
            c = s2.charAt(j);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) == 0)
                n++;
            if (j - i + 1 > s1.length()) {
                c = s2.charAt(i);
                if(map.get(c)==0) n--;
                map.put(c, map.getOrDefault(c, 0) + 1);
                
                i++;
            }
            if(j-i+1==s1.length()&& n==k){
                return true;
            }
            j++;
        }
        return false;

    }
}
}
