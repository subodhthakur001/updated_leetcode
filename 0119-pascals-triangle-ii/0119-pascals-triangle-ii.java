class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long n = 1;
        ans.add((int)n);
        if(rowIndex == 0){
            return ans;
        }
        for(int i = 0;i <= rowIndex - 1; i++){
             n = n * (rowIndex - i)/ (i + 1);
            int u=(int) n;
            ans.add(u);
        }
        
        return ans;
    }
}