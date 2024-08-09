class Solution {
    public void getSubsets(int i, List<Integer> ds, List<List<Integer>> ans, int[] nums){
        if(i == nums.length){
            ans.add(new ArrayList(ds));
            return;
        }
        ds.add(nums[i]);
        getSubsets(i+1,ds,ans,nums);
        ds.remove(ds.size() - 1);
        getSubsets(i+1,ds,ans,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        getSubsets(0,ds,ans,nums);
        return ans;
    }
    
}