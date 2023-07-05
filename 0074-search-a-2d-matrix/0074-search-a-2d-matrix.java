class Solution {
//     public boolean binarySearch(int[] arr, int target){
//         int start = 0;
//         int end = arr.length - 1;
//         while(start <= end){
//             int mid = (start + end) / 2;
//             if(target < arr[mid]){
                
//             }
//         }
//     }
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length - 1;
        int pointer = matrix[0].length - 1;
        for(int row = 0; row < matrix.length; row++){
            if(target <= matrix[row][col]){
                while(pointer >= 0){
                    if(matrix[row][pointer] == target){
                        return true;
                    }
                    pointer--;
                }
                pointer = matrix[0].length - 1;
            }
        }
        return false;
    }
}