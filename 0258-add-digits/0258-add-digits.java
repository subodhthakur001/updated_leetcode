class Solution {
    public int addDigits(int num) {
        int temp = num;
        int ans = 0;
        int sum = 0;
        while(true){
            ans = check(temp,sum);
            if(ans < 10){
                break;
            }
            else{
                temp = ans;
            }  
        }
        return ans;
    }
    public int check(int n,int sum){
        while(n != 0){
            int dig = n % 10;
            sum += dig;
            n = n / 10;
        }
        return sum;
    }
}
