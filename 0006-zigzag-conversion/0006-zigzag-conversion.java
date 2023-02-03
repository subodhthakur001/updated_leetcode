class Solution {
    public String convert(String s, int numRows) {
        int count=0;
        int row =0;
        int col=0;
        int pointer = 0;
        String ans= new String();
        int n=s.length()%2==0?s.length()/2:(s.length()/2)+1;
        char[][] arr= new char[numRows][n];
        if(s.length()==1 || numRows==1){
            return s;
        }
        //for filling . in arr array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]='#';
            }
        }
        while(true){
            while(row<numRows&&count < s.length()){
                arr[row][col] = s.charAt(pointer);
                pointer++;
                count++;
                row++;
            }
            row=row-2;
            col++;
          while(row>=0 && count < s.length()){
              arr[row][col]=s.charAt(pointer);
              col++;
              row--;
              count++;
              pointer++;
          }
            row=row+2;
            col--;
           if(count==s.length()){
               break;
           } 
        }
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!='#'){
                    ans = ans + arr[i][j];
                }
            }
        }
        return ans;
    }
}