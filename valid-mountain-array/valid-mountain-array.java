class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        int pointer = 0;
         for(int i = 0; i < arr.length -1; i++){
                if(arr[i] <= arr[i+1]){
                    flag3 = false;
                    break;
                }
            }
        if(flag3==true){
            return false;
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] >= arr[i+1]){
                flag1 = false;
                pointer = i;
                break;
            }
        }
        if(flag1 == true){
            return false;
        }
        else {
            for(int i = pointer; i < arr.length -1; i++){
                if(arr[i] <= arr[i+1]){
                    flag2 = false;
                    break;
                }
            }
        }
        return flag1 || flag2;
    }
}