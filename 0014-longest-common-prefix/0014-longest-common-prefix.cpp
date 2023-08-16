class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans = "";
        sort(strs.begin() , strs.end());
        //flight , flow , flower
        for(int i = 0; i < strs[0].length(); i++){
            if(strs[0][i] != strs[strs.size() - 1][i]){
                break;
            }
            ans += strs[0][i];
        }
        return ans;
    }
};