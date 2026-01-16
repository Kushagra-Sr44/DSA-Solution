//https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field
class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        Arrays.sort(hFences);
        Arrays.sort(vFences);
        HashSet<Integer> seth = new HashSet<>();
        for (int i = -1; i < hFences.length; i++) {
            int a;
            if (i == -1)
                a = 1;
            else
                a = hFences[i];
            for (int j = i + 1; j <= hFences.length; j++) {
                if (j == hFences.length)
                    seth.add(m - a);
                else
                    seth.add(hFences[j] - a);
            }
        }
        HashSet<Integer> setv=new HashSet<>();
           for(int i=-1;i<vFences.length;i++){
            int a;
            if(i==-1) a=1;
            else a=vFences[i];
            for(int j=i+1;j<=vFences.length;j++){
               if(j==vFences.length) setv.add(n-a);
               else setv.add(vFences[j]-a);
            }
           }
        long ans=-1;
        int mod=1000000007;
        for(int i:seth){
            if(setv.contains(i)) {
                if(i>ans) ans=i%mod;
            }
        }
        if(ans==-1) return -1;
        return (int)( ans*ans%mod);

    }
}
