class Solution {
public:
    int strStr(string haystack, string needle) {
        int i = 0;
        int j = 0;
        int k = 0;
        bool b = true;
        while(i < haystack.length()){
            if(haystack[i] == needle[j]){
                k = i;
                b = true;
                while(j < needle.length()){
                    if(haystack[i] != needle[j]){
                        b = false;
                        break;
                    }
                    i++;
                    j++;
                }
                if(b == true) return k;
                else{
                    j = 0;
                    i = k;
                }
            }
            i++;
        }
        return -1;
    }
};