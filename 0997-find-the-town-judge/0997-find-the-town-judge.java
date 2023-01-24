// class Solution{
//     public int findJudge(int n, int[][] trust){
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         if(n == 1 && trust.length == 0) return 1;
//         for(int i = 0; i < trust.length; i++){
//             hm.put(trust[i][0] , trust[i][1]);
//         }
//         for(int i = 1; i <= n; i++){
//             if(!hm.containsKey(i)){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1 && trust.length == 0) return 1;
        int [] count = new int[n+1];
        for(int i = 0;i<trust.length;i++){
            
            count[trust[i][0]]--;
            
            count[trust[i][1]]++;
        }

       for(int i = 0;i<count.length;i++){
           if(count[i] ==n-1)  return i;
       }
        return -1;
    }
}

