//https://leetcode.com/problems/minimum-absolute-difference
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(min==arr[i+1]-arr[i])
             list.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
        }
        return list;
    }
}
