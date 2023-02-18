// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j =1;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]!=nums[i+1]){
//                 nums[j]=nums[i+1];
//                 j++;
//             }
//         }
//         return j;
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        int i = 0;
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i+1;
    }
}