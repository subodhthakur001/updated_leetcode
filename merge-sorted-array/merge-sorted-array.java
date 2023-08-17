class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
           // int start = 0;
           int end = nums1.length - 1;
           for(int start = 0; start < nums2.length; start++){
               nums1[m++] = nums2[start];
               end--;
           }
        Arrays.sort(nums1);
    }
}