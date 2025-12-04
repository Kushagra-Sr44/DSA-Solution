class Solution {
    public int countCollisions(String directions) {
        int i=0;
        int n=directions.length();
        int j=n-1;
        while(i<n&&directions.charAt(i)=='L'){
         i++;
        }
        while(j>=0 && directions.charAt(j)=='R'){
            j--;
        }
        int c=0;
        
        while(i<=j ){
            if(directions.charAt(i)!='S')c++;
            i++;
        }
        return c;

    }
}
