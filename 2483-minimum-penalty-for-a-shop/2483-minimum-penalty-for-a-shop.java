class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0;
        int n = customers.length();
        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='Y'){
                penalty++;
            }
        }
        int minPenalty = penalty;
        int closeTime = 0;
        for(int i=0;i<n;i++){
            if(customers.charAt(i)=='Y'){
                penalty--;
            }else{
                penalty++;
            }
            if(penalty<minPenalty){
                minPenalty = penalty;
                closeTime = i+1;
            }
        }
        return closeTime;
    }
}