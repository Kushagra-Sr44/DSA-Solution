//https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i
class Solution {
    public int minimumPairRemoval(int[] nums) {
       int c=0;
        List<Integer> list=new ArrayList<>();
     for(int i:nums){
    list.add(i);
     }  
     while(check(list)){
        c++;
        remove(list);
     }
        return c;
    }

    public void remove(List li) {
        int min = Integer.MAX_VALUE;
        int k = -1;
        for (int i = 0; i < li.size() - 1; i++) {
            if ((int)li.get(i) + (int)li.get(i + 1) < min) {
                min = (int)li.get(i) + (int)li.get(i + 1);
                k = i;
            }
        }
        if(k!=-1){
        li.remove(k);
        li.remove(k);
        li.add(k,min);
        }
    }
    public boolean check(List li) {
        for (int i = 0; i < li.size() - 1; i++) {
            if ((int)li.get(i) >(int)li.get(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
