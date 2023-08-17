class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        unordered_set<int> us;
        vector<int> ans;
        for(int i = 0; i < nums.size(); i++){
            us.insert(nums[i]);
        }
        for(int i = 1; i <= nums.size(); i++){
            if(us.find(i) == us.end()){
                ans.push_back(i);
            }
        }
        return ans;
    }
};