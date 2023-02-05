// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> list = new ArrayList<>();
//         int n = p.length();
//         HashMap<Character,Integer> hm = new HashMap<>();
//         HashMap<Character,Integer> tm = new HashMap<>();
//         for(char c : p.toCharArray()){
//             hm.put(c,hm.getOrDefault(c , 0)+1);
//         }
        
        
//         // System.out.println(hm);
//         for(int i = 0; i <= s.length() - n; i++){
//             // if(n + i > s2.length()){
//             //     break;
//             // }
//             String ans = s.substring(i , n + i);
             
//             for(int j = 0; j < ans.length(); j++){
                
//             tm.put(ans.charAt(j),tm.getOrDefault(ans.charAt(j) , 0)+1);
                 
//             }
//            if(tm.equals(hm)){
//                list.add(i);
//            }
//             tm.clear();
            
//         }
//         return list;
//     }
        
//     }
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if(s.length() < p.length()){
            return res;
        }
        int[] ct1 = new int[26];
        int[] ct2 = new int[26];

        int k = p.length();

        for(char it : p.toCharArray()){
            ct1[it-'a']++;
        }

        int i = 0;

        while(i < k){
            ct2[s.charAt(i++)-'a']++;
        }

        k = s.length();
        int j = 0;

        if(Arrays.equals(ct1, ct2)){
            res.add(j);
        }

        while(i < k){

            ct2[s.charAt(j++)-'a']--;
            ct2[s.charAt(i++)-'a']++;

            if(Arrays.equals(ct1, ct2)){
                res.add(j);
            }
        }

        return res;
    }
}
