class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        int ans = 0;
        priority_queue<int> pq;
        for(int i : nums){
            pq.push(i);
        }
        while(k > 0){
            ans = pq.top();
            pq.pop();
            k--;
        }
        return ans;
    }
};