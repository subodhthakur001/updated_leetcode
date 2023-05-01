/*
T.C. -> O(N) + O(N) 
S.C. -> O(N)
*/
class Solution {
    public double average(int[] salary) {
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
        int num = 0;
        int den = 0;
       for(int i = 0; i < salary.length; i++){
           max = Math.max(max,salary[i]);
           min = Math.min(min,salary[i]);
       }
        for(int i = 0; i < salary.length; i++){
            if((salary[i] != max) && (salary[i] != min)){
                 num += salary[i];
                 den++;
            }
            
        }
        Double ans = (double) num / den;
        
       return ans;
    }
}