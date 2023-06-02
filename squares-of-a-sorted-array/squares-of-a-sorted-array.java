class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
        int[] ans = new int[nums.length];
        int k = ans.length - 1;
        while(k >= 0){
            if(nums[left] < nums[right]){
                ans[k] = nums[right];
                right--;
                k--;
            }
            else{
                ans[k] = nums[left];
                left++;
                k--;
            }
        }
        return ans;
    }
}