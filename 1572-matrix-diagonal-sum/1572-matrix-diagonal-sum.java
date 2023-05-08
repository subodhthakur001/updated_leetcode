class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if(mat.length % 2 == 0){
            int i = 0;
            int j = 0;
            for(i = 0; i < mat.length; i++){
                j = i;
                sum += mat[i][j];
            }
            int k = 0;
            int l = mat.length - 1;
            while(l >= 0){
                sum += mat[k][l];
                  k++;
                  l--;
        }
        }
        else{
            int mid = mat.length / 2;
            int i = 0;
            int j = 0;
            for(i = 0; i < mat.length; i++){
                j = i;
                sum += mat[i][j];
            }
            int k = 0;
            int l = mat.length - 1;
            while(l >= 0){
                if((k != mid) && (l != mid)){
                    sum += mat[k][l];
                }
                  k++;
                  l--;
        }
            
        }
        return sum;
    }
}