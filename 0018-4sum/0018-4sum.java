class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
           for(int j = i + 1; j < nums.length; j++){
               int start = j + 1;
               int end = nums.length - 1;
               while(start < end){
                   long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];
                   if(sum > target){
                       end--;
                   }
                    else if(sum < target){
                       start++;
                   }
                   else {
                       List<Integer> list = new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[start]);
                       list.add(nums[end]);
                       ans.add(list);
                      while(start<end && nums[start]==nums[start+1])start++;
                        while(end<nums.length-1 && nums[end-1]==nums[end])end--;
                       start++;
                       end--;
                   }
                  
               }
               while(j < nums.length - 1 && nums[j] == nums[j+1])j++;
           }
            while(i < nums.length - 1 && nums[i] == nums[i+1])i++;
        }
        return ans;
    }
}