class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int count = 0;
        int minlen = Integer.MAX_VALUE;
        int sum = 0;
        while(end < nums.length){
            sum += nums[end];
            while(sum >= target){
                minlen = Math.min(minlen, (end - start)+1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}