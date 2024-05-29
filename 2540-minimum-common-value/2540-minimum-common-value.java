class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        for(int i : nums1){
            hs1.add(i);
        }
        
        for(int i : nums2){
            if(hs1.contains(i)){
                hs2.add(i);
                int ans = 0;
                for(int j : hs2){
                    ans = j;
                }
                return ans;
            }
        }
        return -1;
    }
}