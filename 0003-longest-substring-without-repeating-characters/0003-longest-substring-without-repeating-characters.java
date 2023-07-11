class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        while(right < s.length()){
            if(!hs.contains(s.charAt(right))){
                hs.add(s.charAt(right));
                max = Math.max(max,hs.size());
                right++;
            }
            else{
                hs.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}