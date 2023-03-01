class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }
        int i = 0;
        while(!pq.isEmpty()){
            int temp = pq.remove();
            ans[i] = temp;
            i++;
        }
        return ans;
    }
}