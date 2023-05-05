// class Solution {
//     public int maxVowels(String s, int k) {
//         HashSet<Character> hs = new HashSet<>();
//         hs.add('a');
//         hs.add('e');
//         hs.add('i');
//         hs.add('o');
//         hs.add('u');
//         int vowels = Integer.MIN_VALUE;
//         for(int i = 0; i <= s.length() - k; i++){
//             String sub = s.substring(i, i+k);
//             int ans = countVowels(hs,sub);
//             vowels = Math.max(ans,vowels);
//         }
//         return vowels;
//     }
//     public int countVowels(HashSet<Character> hs, String sub){
//         int count = 0;
//         for(int i = 0; i < sub.length(); i++){
//             if(hs.contains(sub.charAt(i))){
//                 count++;
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int maxVowels(String s, int k) {
        List<Character> v = Arrays.asList('a', 'e', 'i', 'o', 'u');
        Set<Character> vowels = new HashSet<Character>(v);

        int vcount =0;
        for(int i=0 ;i<k; i++){
            if(vowels.contains(s.charAt(i))) vcount++;
        }

        int max = vcount;
        int left =0;
        int right = k-1;
        while(right<s.length()-1){
            if(vowels.contains(s.charAt(left))) vcount--;
            left++;
            right++;
            if(vowels.contains(s.charAt(right))) vcount++;
            max = Math.max(max, vcount);
        }

        return max;
    }
}