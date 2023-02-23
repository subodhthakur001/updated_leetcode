// class Solution {
//     public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
//            int n = capital.length;
//            HashMap<Integer,PriorityQueue<Integer>> hm = new HashMap<>();
//            for(int i = 0; i < n; i++){
//               if(!hm.containsKey(capital[i])){
//                   PriorityQueue<Integer> pq= new PriorityQueue<Integer>((a, b) -> b - a);
//                   pq.add(profits[i]);
//                   hm.put(capital[i] ,pq);
//               }
//                else{
//                    hm.get(capital[i]).add(profits[i]);
//                }
//            }
//            System.out.println(hm);
//         while(k > 0){
//              int temp = w;
//              while(temp >= 0){
//                  if(hm.containsKey(temp)){
//                      if(!(hm.get(temp).isEmpty())){
//                         w += hm.get(temp).poll();
//                         break; 
//                      }
//                      else{
//                          break;
//                      }
                     
//                  }
//                  else{
//                      temp--;
//                  }
//              }
            
            
//             k--;
//         }
        
//        return w;    
           
//     }
// }
class Solution {
    class Pair implements Comparable<Pair> {
        int capital, profit;

        public Pair(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }

        public int compareTo(Pair pair) {
            return capital - pair.capital;
        }
    }
    
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        Pair [] projects = new Pair[n];
        for(int i = 0;i<n;i++){
            projects[i] = new Pair(capital[i],profits[i]);
        }
        
        Arrays.sort(projects);
        PriorityQueue<Integer> priority = new PriorityQueue<Integer>( Collections.reverseOrder());
        int j = 0;
        int ans = w;
        for(int i = 0;i<k;i++){
            while(j<n && projects[j].capital<=ans){
                priority.add(projects[j++].profit);
            }
            if(priority.isEmpty()){
                break;
            }
            ans+=priority.poll();
        }
        return ans;
    }
}