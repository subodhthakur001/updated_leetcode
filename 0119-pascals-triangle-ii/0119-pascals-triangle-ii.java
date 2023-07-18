class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long n = 1;
        list.add((int)n);
        if(rowIndex == 0) return list;
        
        for(int i = 0; i <= rowIndex - 1; i++){
            n = n * (rowIndex - i) / (i + 1);
            list.add((int)n);
        }
        return list;
    }
}