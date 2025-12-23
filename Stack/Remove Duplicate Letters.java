    class Solution {
        public String removeDuplicateLetters(String s) {
            ArrayDeque<Integer> st=new ArrayDeque<>();
            int[] visit=new int[26];
            int [] freq=new int[26];
            for(int i=0;i<s.length();i++){
                int p=s.charAt(i)-'a';
                freq[p]++;
            }
           for(int i=0;i<s.length();i++){
                  
                int p=s.charAt(i)-'a';
               freq[p]--;
                if(st.isEmpty()){
                    st.push(p);
                    visit[p]=1;

                }
               else{
                   if(visit[p]==1) {continue;}
                   else 
                   {
                       while(!st.isEmpty()&&st.peek()>p&& freq[st.peek()]>0 ){
                      visit[st.peek()]=0;
                           st.pop();
                       
                       
                   }
                   st.push(p);
                visit[p]=1;
            
               }}
            }
          
            StringBuilder sb=new StringBuilder();
            for(Integer i:st){
                sb.append((char)(i+'a'));
            }
            return sb.reverse().toString();
            
        }
    }
