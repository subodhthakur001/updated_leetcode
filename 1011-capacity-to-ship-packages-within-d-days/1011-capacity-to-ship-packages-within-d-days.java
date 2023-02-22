class Solution {
    public int shipWithinDays(int[] weights, int days) {
            int n = weights.length;
            int total = 0;
            int max = 0;
            int ans = 0;
          for(int i = 0; i < n; i++){
              total += weights[i];
              max = Math.max(max, weights[i]);
          }
        // System.out.println(max);
        // System.out.println(total);
        int s = max;
        int e = total;
        while(s <= e)
        {
            int mid = (s + e) / 2;
            // System.out.println(mid);
            int checkdays = countDays(weights,mid);
            System.out.println(checkdays);
            if(checkdays > days){
                 s = mid + 1;
            }
            else{
                ans = mid;
                e = mid - 1;
            } 
            
        }
        return ans;
           
    }
    public int countDays(int[]weights, int mid){
        int i = 0;
        int count = 0;
        int sum = 0;
        while(i < weights.length){
            sum += weights[i];
            if(sum == mid){
                count++;
                sum = 0;
                i++;
            }
            else if(sum > mid){
                count++;
                sum = 0;
            }
            else{
                i++;
            }
                
        }
        if(sum != 0){
             count++;
        }
        return count;
    }
}