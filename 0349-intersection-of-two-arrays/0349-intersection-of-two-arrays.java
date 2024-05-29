class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        for(int i : nums1){
            hs1.add(i);
        }
        for(int i : nums2){
            if(hs1.contains(i)){
                hs2.add(i);
            }
        }
        
        
        int[] ans = new int[hs2.size()];
        int i = 0;
        for(int x : hs2){
            ans[i] = x;
            i++;
        }
        return ans;
    }
}