// class Solution {
//     public int minimizeArrayValue(int[] nums) {
//         while(true){
//             int i = findmaxindex(nums);
//             if(i == 0) break;
//             else{
//                 nums[i]--;
//                 nums[i - 1]++;
//             }
//         }
//         return nums[0];
//     }
//     public int findmaxindex(int[] nums){
//         int max = Integer.MIN_VALUE;
//          int n  = nums.length;
//          int index = 0;
//         for(int i = 0; i < n; i++){
//             if(max <= nums[i]){
//                 max = nums[i];
//                 index = i;
//             }
//         }
//         if(nums[0] == max){
//             return 0;
//         }
//         return index;
//     }
// }
class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,(int)intCeil(sum,i+1));
        }
        return max;
    }
    public long intCeil(long a,int b) {
      if(a%b!=0) {
          return (a/b)+1;
      }
      else 
          return a/b;
    }
}