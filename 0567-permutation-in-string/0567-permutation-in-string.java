class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count=0;
        int n = s1.length();
        HashMap<Character,Integer> hm = new HashMap<>();
        HashMap<Character,Integer> tm = new HashMap<>();
        for(char c : s1.toCharArray()){
            hm.put(c,hm.getOrDefault(c , 0)+1);
        }
        
        
        // System.out.println(hm);
        for(int i = 0; i <= s2.length() - n; i++){
            // if(n + i > s2.length()){
            //     break;
            // }
            String s = s2.substring(i , n + i);
             
            for(int j = 0; j < s.length(); j++){
                
            tm.put(s.charAt(j),tm.getOrDefault(s.charAt(j) , 0)+1);
                 
            }
           
            
           if(tm.equals(hm)){
               return true;
           }
            tm.clear();
            
        }
        return false;
    }
}