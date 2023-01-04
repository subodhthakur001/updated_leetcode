class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i=0; i<tasks.length; i++){
            if(m.containsKey(tasks[i])){
                m.put(tasks[i], m.get(tasks[i])+1);
            }else{
                m.put(tasks[i], 1);
            }
        }
        int ans =0;
        for(int map_count : m.values()){
            if(map_count < 2){
                return -1;
            }
            ans = ans+(map_count/3);
            if(map_count % 3 != 0){
                ans++;
            }
         }
        return ans;
    }
}