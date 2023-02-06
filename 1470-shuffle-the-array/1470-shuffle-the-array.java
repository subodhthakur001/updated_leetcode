// T.C. -> O(logn)
// S.C. -> O(n)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length;
        int[] ans = new int[size];
        int i =0;int j = n;
        int p = 0;
        while(j < size){
            ans[p++] = nums[i++];
            ans[p++] = nums[j++];
        }
        return ans;
    }
}
