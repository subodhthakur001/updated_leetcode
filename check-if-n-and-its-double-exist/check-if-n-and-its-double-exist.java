class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int tw= arr[i]*2;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                   if(arr[j]==tw)return true; 
                }
            }
        }
        return false;
    }
}