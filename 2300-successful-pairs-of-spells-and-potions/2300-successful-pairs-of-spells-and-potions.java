// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         int count = 0;
//         int[] ans = new int[spells.length];
//         int pointer = 0;
//         int s=0;
//         int e = potions.length-1;
//         for(int i : spells){
//             while(s <= e){
//                 long u = i;
//                 long l = potions[s];
//                 long q = potions[e];
//                 if(s != e){
//                  if((u * l) >= success){
//                     count++;
//                  }
//                  if((u * q) >= success){
//                     count++;
//                  }
//                 }
//                 else{
//                   if((u * q) >= success){
//                     count++;
//                  }
//                 }
               
//                 s++;
//                 e--;
//             }
           
//             ans[pointer] = count;
//             pointer++;
//             count = 0;
//             s = 0;
//             e = potions.length - 1;
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int [] result = new int[spells.length];
        int potionsLength = potions.length;
        Arrays.sort(potions);

        for(int i=0; i<spells.length; i++){
            int minIndex = binarySearch(potions, success, spells[i]);
            result[i] = potionsLength - minIndex;
        }
        return result;
    }

    private int binarySearch(int [] potions, long success, int spell){
        int left= 0;
        int right= potions.length;
        
        while(left<right){
            int mid = left + (right-left)/2;
            long product = (1l * spell) * potions[mid];
            if(product<success){
                left=mid+1;
            }else{
                right=mid;
            }
        }

        return left;
    }
}