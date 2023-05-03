class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            hs1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            hs2.add(nums2[i]);
        }
        for(Integer i : hs1){
            if(!hs2.contains(i)){
                list.add(i);
            }
        }
        ans.add(list);
        list = new ArrayList<>();
        for(Integer i : hs2){
            if(!hs1.contains(i)){
                list.add(i);
            }
        }
        ans.add(list);
        return ans;
    }
}