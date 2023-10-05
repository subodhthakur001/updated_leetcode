class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        HashMap<Integer , Integer> hm = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i: hm.keySet()){
            if(hm.get(i)>n){
                ans.add(i);
            }
        }
        return ans;
    } 
}