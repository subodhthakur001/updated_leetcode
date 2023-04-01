class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        int i = 0;
        int n = nums.length;
        while(i <= n - 1){
            if(nums[i] < 0){
                neg++;
            }
            else if(nums[i] > 0){
                pos++;
            }
            i++;
        }
        return Math.max(neg,pos);
    }
}