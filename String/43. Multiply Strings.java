//https://leetcode.com/problems/multiply-strings
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = num2.length() - 1; i >= 0; i--) {
            int x = num2.length() - i - 1;
            int a = num2.charAt(i) - '0';
            int br = 0;
            for (int j = num1.length() - 1; j >= 0; j--) {
                int b = num1.charAt(j) - '0';
                int y = num1.length() - j - 1;
                int r = a * b + br;
                if (x+y < num.size()) {
                    r = r + num.get(x+y);
                    br = r / 10;
                    r = r % 10;
                    num.set(x+y, r);
                } else {
                    br = r / 10;
                    r = r % 10;
                    num.add(r);
                }
            }
            if (br != 0)
                num.add(br);
        }
        String st="";
        for(int i=num.size()-1;i>=0;i--)
       st=st+num.get(i);
      
        return st;
    }
}
