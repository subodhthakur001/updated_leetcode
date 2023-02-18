class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i + 1; j < arr.length; j++){
                max = Math.max(max,arr[j]);
            }
            ans[i] = max;
            
        }
        ans[n - 1] = -1;
        return ans;
    }
}