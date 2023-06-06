class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
          Arrays.sort(arr);
          int i = 1;
        int diff = Math.abs(arr[i] - arr[i - 1]);
          while(i < arr.length){
               if(Math.abs(arr[i] - arr[i - 1]) != diff){
                   return false;
               }
              i++;
          }
        return true;
    }
}