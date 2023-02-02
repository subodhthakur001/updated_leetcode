// class Solution {
//     public boolean isAlienSorted(String[] words, String order) {
//         HashMap<Character,Integer> hm = new HashMap<>();
//         for(int i = 0;i < order.length(); i++){
//             hm.put(order.charAt(i),i);
//         }
//         for(int i = 0; i < words.length - 1; i++){
//             if(!check(words[i],words[i+1],words,order,hm)){
//                 return false;
//             }
//         }
//         return true;
        
//     }
//     public boolean check (String f,String e,String[] words,String order,HashMap<Character,Integer> hm ){    
//        int first = f.length();
//        int second = e.length();
//         int j = 0;
//         int len = 0;
//         if(hm.get(f.charAt(0)) < hm.get(e.charAt(0))){
//             return true;
//         }
//        if(first <= second){
//            len = first;
//        }
//         else if(second < first){
//             len = second;
//         }
//         if(second < first && words[j+1].equals(e)){
//             return false;
//         }
        
//         else{
//             for(int i = 0; i < len; i++){
//             if(hm.get(f.charAt(i)) > hm.get(e.charAt(i))){
//                 return false;
//             }
            
//         }
//         }
        
//         return true;
//     }
// }
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<order.length();i++){
            hm.put(order.charAt(i),i);
        }
        for(int i=1;i<words.length;i++){
            if(!isSorted(words[i],words[i-1],hm)){
                return false;
            }
        }
        return true ;
    }
    public boolean isSorted(String s, String e, HashMap<Character,Integer> hm ){
           if(s.length()==0&&e.length()!=0){
               return false;
           }
        if(s.length()!=0&&e.length()==0){
               return true;
           }
        if(s.length()==0&&e.length()==0){
            return true;
        }
        if(hm.get(s.charAt(0))>hm.get(e.charAt(0))){
            return true;
        }
        else if(hm.get(s.charAt(0))<hm.get(e.charAt(0))){
            return false;
        }
        else{
           String s1= s.substring(1);
            String s2 = e.substring(1);
            return isSorted(s1,s2,hm);
        }
    }
}