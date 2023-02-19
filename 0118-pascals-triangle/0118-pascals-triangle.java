class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list2 = new ArrayList<>();
        // list2.add(new ArrayList<>(1));
        List<Integer> prev = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i - 1){
                    list.add(1);
                }
                
                else{
                    list.add(prev.get(j-1) + prev.get(j));
                    
                }
            }
            prev = list;
            list2.add(list);
        }
        return list2;
    }
}