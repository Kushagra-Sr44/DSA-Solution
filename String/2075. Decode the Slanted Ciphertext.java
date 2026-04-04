//https://leetcode.com/problems/decode-the-slanted-ciphertext
class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int cols=encodedText.length()/rows;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<cols;i++){
            for(int j=i;j<encodedText.length();j=j+cols+1){
                sb.append(encodedText.charAt(j));
            }
        }
        
        return sb.toString().stripTrailing();

    }
}
