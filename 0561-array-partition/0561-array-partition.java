class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = 0;
        int pointer = 0;
        int end = nums.length / 2;
        while(i < end){
            sum += nums[pointer];
            pointer += 2;
            i++;
        }
        return sum;
    }
}