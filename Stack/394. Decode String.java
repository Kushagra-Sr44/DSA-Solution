// https://leetcode.com/problems/decode-string/
class Solution {
    public boolean isNum(String s){
        int x=s.charAt(0)-'0';
        return x>=0 && x<=9;
    }
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==']'){
                String k="";
                while(!st.isEmpty() && st.peek().charAt(0)!='['){
                    k+=st.pop();
                }
                st.pop();
                String p="";
                while(!st.isEmpty() && isNum(st.peek())){
                    p=st.pop()+p;
                }
                String news="";
                for(int j=0;j<Integer.valueOf(p);j++){
                    news+=k;
                }
                st.push(news);
            }
            else{
                st.push(""+c);
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}
