/*class Solution {
    public static void backtrack(int i, String digits, HashMap<Character,String> hm,StringBuilder sb,List<String> ans){
        //base condition
        if(i==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr = hm.get(digits.charAt(i));
        for(int k=0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            backtrack(i+1,digits,hm,sb,ans);
            //backtrack
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
         List<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        StringBuilder sb = new StringBuilder();
        backtrack(0,digits,hm,sb,ans);
        return ans;
        
    }
}*/
class Solution{
    public static void func(int i,String digits,StringBuilder sb,HashMap<Character,String> hm,List<String> ans){
        if(i==digits.length()){
            ans.add(sb.toString());
            return;
        }
        String curr = hm.get(digits.charAt(i));
        for(int k =0;k<curr.length();k++){
            sb.append(curr.charAt(k));
            func(i+1,digits,sb,hm,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        StringBuilder sb = new StringBuilder();
        func(0,digits,sb,hm,ans);
        return ans;
        
    }
}