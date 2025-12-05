class Solution {
    public int search(int[] nums, int target) {
        return searchrec(nums,target,0,nums.length-1);
    }
    public int searchrec(int []arr,int x,int i,int j){
        if(i>j)return -1;
        int mid=(i+j)/2;
        if(arr[mid]==x) return mid;
        if(arr[mid]<x) return searchrec(arr,x,mid+1,j);
        return searchrec(arr,x,i,mid-1);
    }
}
