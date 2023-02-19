class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] arr = new int[n+1];
        int i = n - 1;
        while(i >= 0){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            else{
                digits[i] = 0;
            }
            i--;
        }
        if(digits[0] == 0){
            
            arr[0] = 1;
        }
        return arr;
        }
    }

