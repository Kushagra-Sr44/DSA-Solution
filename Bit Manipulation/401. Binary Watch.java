//https://leetcode.com/problems/binary-watch
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(count(i,j)==turnedOn){
                    String st=i+":";
                    if(j<10) st+=0;
                    st+=j;
                    list.add(st);
                }
            }
        }
        return list;
    }
    public int count(int x,int y){
        String s=Integer.toBinaryString(x);
        String st=Integer.toBinaryString(y);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')c++;

        }
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1')c++;           
        }
        return c;
        }
}
