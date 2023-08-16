class Solution {
public:
    string addStrings(string num1, string num2) {
        string ans = "";
        int carry = 0;
        for(int i = num1.length() -1,j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--,j--){
            int x = i < 0 ? 0 : num1[i] - '0';
            int y = j < 0 ? 0 : num2[j] - '0';
            ans += ((x + y + carry) % 10) + '0';
            carry = (x + y + carry) / 10;
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};