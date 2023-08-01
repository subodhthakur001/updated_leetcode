class Solution{
    public void func(int i, int n, int k , List<Integer> ds, List<List<Integer>> ans){
        if(k==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(i>n)return;
        if(k>n-i+1) return;
        //pick
        ds.add(i);
        func(i+1,n,k-1,ds,ans);
        //backtrack
        ds.remove(ds.size()-1);
        //not pick
        func(i+1,n,k,ds,ans);
    }
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        func(1,n,k,ds,ans);
        return ans;
        
    }
}