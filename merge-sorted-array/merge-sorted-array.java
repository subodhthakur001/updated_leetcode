class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p = 0;
       for(int i = nums1.length-1; i >= m; i--){
           if(nums1[i] == 0){
               nums1[i] = nums2[p];
               p++;
           }
       }
      Arrays.sort(nums1);
    }
}