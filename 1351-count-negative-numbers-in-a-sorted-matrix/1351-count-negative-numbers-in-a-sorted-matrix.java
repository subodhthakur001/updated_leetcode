class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            ans += helper(grid[i]);
        }
        return ans;
    }
    public int helper(int[] arr){
        int count = 0;
        for(int i = arr.length - 1; i>= 0; i--){
            if(arr[i] < 0) count++;
        }
        return count;
    }
}