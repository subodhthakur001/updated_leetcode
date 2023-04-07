class Solution {
    public int helper(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        int curri = 0;
        for(int i = 1; i < n; i++){
            int pick = nums[i] +((i >= 2)?prev2:0);
            int notpick = 0 + prev;
            curri = Math.max(pick,notpick);
            prev2 = prev;
            prev = curri;
        }
        return prev;
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] temp1 = new int[nums.length - 1];
        int[] temp2 = new int[nums.length - 1];
        for(int i = 1; i <nums.length; i++){
             temp1[i-1] = nums[i];
        }
        for(int i = 0; i < nums.length - 1; i++){
            temp2[i] = nums[i];
        }
        return Math.max(helper(temp1), helper(temp2));
        
    }
}