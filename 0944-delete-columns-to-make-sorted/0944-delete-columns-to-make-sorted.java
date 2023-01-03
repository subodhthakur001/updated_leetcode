/* 
T.C. -> O(n) + o(n *2)
S.C -> o(n*n) + o(n)
*/
class Solution {
    public int minDeletionSize(String[] strs) {
        char[][] arr = new char[strs.length][strs[0].length()];
        int count = 0;
        for(int i = 0; i < strs.length; i++){
            char[] c = strs[i].toCharArray();
            arr[i] = c;
        }
       for(int i = 0; i < arr[0].length; i++){
          for(int j = 0; j < arr.length - 1; j++){
               int check = Character.compare(arr[j][i], arr[j+1][i]);
               if(check > 0){
                   count++;
                   break;
               }
          }
           
        }      
      return count;  
    }
}