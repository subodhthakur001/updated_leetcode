class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i:arr){
            hs.add(i);
        }
        for(int i = 1; i <= 2000; i++){
            if(!hs.contains(i)){
                list.add(i);
            }
        }
        // System.out.print(list);
       return list.get(k-1); 
        
    }
}