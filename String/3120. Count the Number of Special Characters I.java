// https://leetcode.com/problems/count-the-number-of-special-characters-i
class Solution {
    public int numberOfSpecialChars(String word) {
        int arr[]=new int[26];
        Arrays.fill(arr,word.length());
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            int j=0;
            int v=0;
            if(c>='a'&& c<='z') {
                j=c-'a';
                v=1;
            }
            else{
                j=c-'A';
                v=-1;
            }
            if(arr[j]!=0){
                if(arr[j]==word.length()){
                    arr[j]=v;
                }
                else{
                    if(arr[j]<0 && v>0)arr[j]=0;
                    else if(arr[j]>0 && v<0) arr[j]=0;
                    else arr[j]+=v;
                }
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(arr[i]==0) count++;
        }
        return count;
    }
}
