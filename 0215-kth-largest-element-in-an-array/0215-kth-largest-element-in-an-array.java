class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums){
            pq.add(i);
        }
        // System.out.println(pq);
        while(k > 0){
            ans = pq.remove();
            k--;
        }
        return ans;
    }
}