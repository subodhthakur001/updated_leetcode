class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i = 0;
        int count = 0;
        while(i < s.length()){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                i++;
            }
            else{
                hs.clear();
                count++;
            }
        }
        if(!hs.isEmpty()){
            count++;
        }
        return count;
    }
}