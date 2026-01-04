// https://leetcode.com/problems/four-divisors
Solution {
    public int sumFourDivisors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.keySet().contains(nums[i])) {
                map.put(nums[i], check(nums[i]));
            }
            sum += map.get(nums[i]);
        }
        return sum;
    }
    public int check(int num) {
        int c = 0;
        int s = num+1;
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                int j=num/i;
                if(i==j){
                    c++;
                    s+=i;
                }
               else{ 
                c+=2;
                s += i+j;
                }
                if(c>2) return 0; 
            }
        }
        if (c == 2)
            return s;
        return 0;
    }
}
