class Solution {
    public int findLength(int n){
        String s = n + "";
        return s.length();
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(findLength(i) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}