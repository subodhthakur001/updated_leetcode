class Solution {
    public void findpermute(int j, List<List<Integer>> ans, int[] nums){
        int temp = 0;
        if(j == nums.length){
            ans.add(new ArrayList<>(toList(nums)));
        }
        for(int i = j; i < nums.length; i++){
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            findpermute(j+1,ans,nums);
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
    public static List<Integer> toList(int[]nums){
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        return list;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findpermute(0,ans,nums);
        return ans;
    }
}