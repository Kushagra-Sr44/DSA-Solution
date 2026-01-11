//https://leetcode.com/problems/count-caesar-cipher-pairs/
class Solution {
    public long countPairs(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String s : words) {
            String st = getst(s);
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        
        long res = 0;
        for (int f : map.values()) {
            res += (long) f * (f - 1) / 2;
        }
        return res;
    }
    
    private String getst(String s) {
        int base = s.charAt(0) - 'a';
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            int diff = (s.charAt(i) - 'a' - base + 26) % 26;
            if (i > 0) sb.append(",");
            sb.append(diff);
        }
        return sb.toString();
    }
}

