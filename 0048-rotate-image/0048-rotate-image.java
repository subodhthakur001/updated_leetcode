class Solution {
    public void rotate(int[][] matrix) {
        for(int row=0;row<matrix.length;row++){
            for(int col=row;col<matrix[0].length;col++){
                int t= matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=t;
            }
        }
        for(int i=0;i<matrix.length;i++){
        int l=0;
        int h=matrix[i].length-1;
        while(l<=h){
            int temp = matrix[i][l];
            matrix[i][l]=matrix[i][h];
            matrix[i][h]=temp;
            l++;
            h--;
        }
        // l=0;
        // h=matrix.length-1;
        }    
    }
}