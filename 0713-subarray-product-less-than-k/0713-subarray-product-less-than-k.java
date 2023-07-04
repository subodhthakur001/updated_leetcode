class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long product = 1;
        int count = 0;
        int start = 0;
        int end = 0;
        while(end < nums.length){
            product *= nums[end];
            while(start <= end && product >= k){
                product /= nums[start];
                start++;
            }
            if(product < k){
                count += (end - start) + 1;
            }
            end++;
        }
        return count;
    }
}