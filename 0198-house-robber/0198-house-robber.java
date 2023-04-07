class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(nums.length-1,nums,dp);
        
    }
    public int helper(int index,int[] nums,int[] dp){
        if(index==0)return nums[index];
        if(index<0)return 0;
        if(dp[index]!=-1)return dp[index];
        int pick = nums[index]+ helper(index-2,nums,dp);
        int notpick = 0 + helper(index-1,nums,dp);
        return dp[index] = Math.max(pick,notpick);
    }
}