class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if((low % 2) != 0){
            count++;
            for(low = low + 2; low <= high; low=low+2){
                 count++;
            }
        }
        else{
            for(low = low + 1; low <= high; low=low+2){
                 count++;
            }
        }
        return count;
    }
}