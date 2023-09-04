class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key) == 2){
                list.add(key);
            }
        }
        
        return list;
    }
}