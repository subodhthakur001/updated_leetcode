class Solution {
public:
    void rotation(string &s){
        //abcde
        //bcdea
        //cdeab
         char c = s[0];
        for(int i = 0; i <= s.length() - 2; i++){
            s[i] = s[i+1];
        }
        s[s.length()-1] = c;
        
    }
    bool rotateString(string s, string goal) {
        for(int i = 0; i < s.length(); i++){
            rotation(s);
            if(s == goal)return true;
        }
        return false;
    }
};