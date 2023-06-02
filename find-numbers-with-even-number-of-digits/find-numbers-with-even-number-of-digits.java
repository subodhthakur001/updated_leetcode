class Solution {
    public int checkEven(int element){
        int count = 0;
        while(element != 0){
            element /= 10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int countdigit = 0;
        for(int i = 0; i < nums.length; i++){
            if(checkEven(nums[i]) % 2 == 0){
                countdigit++;
            }
        }
        return countdigit;
    }
}