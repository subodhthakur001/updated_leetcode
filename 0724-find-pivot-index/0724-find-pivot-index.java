class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int totalsum = 0;
        int leftsum = 0;
        int ans = -1;
        for(int i : nums){
            totalsum += i;
        }
        for(int i = 0; i < nums.length; i++){
            totalsum -= nums[i];
            if(totalsum == leftsum){
                  ans = i;
                break;
            }
            else{
                leftsum += nums[i];
            }
            
        }
        return ans;
    }
}