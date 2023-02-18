class Solution {
    public void duplicateZeros(int[] arr) {
        int i=0;
          
           while(i<arr.length){
            if(arr[i] == 0){
                shift(arr,i);
                i=i+2;
            }
            else{
                i++;
            }
        }
    }
    public void shift(int[] arr, int index){
        for(int i = arr.length-2; i >=index; i--){
            arr[i+1] = arr[i]; 
        }
        
        
        if(index!=arr.length-1){
           arr[index+1] = 0;
        }
    }
}