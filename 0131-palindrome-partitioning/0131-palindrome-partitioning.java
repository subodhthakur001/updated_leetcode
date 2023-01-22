/*class Solution {
    public static boolean ispalindrome(String s, int l , int r){
        while(l<=r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
    public static void func(int start,String s, List<String> ds, List<List<String>> ans){
        //base condition
        if(start==s.length()){
              ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=start;i<s.length();i++){
            if(ispalindrome(s,start,i)){
                String sb = s.substring(start,i+1);
                ds.add(sb);
                func(i+1,s,ds,ans);
                //backtracking
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        func(0,s,ds,ans);
        return ans;
    }
}*/
class Solution{
    public boolean isPalindrome(String s, int l , int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--))return false;
        }
        return true;
    }
    public void func(int start, String s, List<String>ds, List<List<String>> ans){
        if(start==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = start;i<s.length();i++){
            if(isPalindrome(s, start,i)){
                ds.add(s.substring(start,i+1));
                func(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        func(0,s,ds,ans);
        return ans;
        
    }
}