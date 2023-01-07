class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int lowestindex = 0;
        int totalgas = 0;
        int totalcost = 0;
        int current = 0;
        for(int i = 0; i < gas.length; i++){
            totalgas += gas[i];
            totalcost += cost[i];
            current = current + gas[i] - cost[i];
            if(current < 0){
                lowestindex = i + 1;
                current = 0;
            }
            
        }
        if(totalgas >= totalcost){
                return lowestindex;
            }
        return -1;
    }
}