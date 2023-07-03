// class Solution {
//     public String swap(String s, int i , int j){
//         String ans = "";
//           char[] arr = s.toCharArray();
//           char c = arr[i];
//           arr[i] = arr[j];
//           arr[j] = c;
//         for(char d : arr){
//             ans += d;
//         }
//         return ans;
//     }
//     public boolean buddyStrings(String s, String goal) {
//         for(int i = 0; i < s.length(); i++){
//             for(int j = i + 1;j < s.length();j++){
//                 String ans = swap(s,i,j);
//                 if(ans.equals(goal)) return true;
//             }
//         }
//         return false;
//     }
// }
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)){
            int [] count = new int[26];
            int c;
            for(int i = 0;i<s.length();i++){
                c = s.charAt(i)-'a';
                count[c]++;
                if(count[c]==2)return true;
            }
            return false;
        }
        
        int index1 = -1;
        int index2 = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != goal.charAt(i)){
                if(index1 == -1) index1 = i;
                else if(index2 == -1) index2 = i;
                else return false;
            }
        }
        if(index2==-1) return false;
        return (s.charAt(index1) == goal.charAt(index2) && s.charAt(index2) == goal.charAt(index1));
    }
}