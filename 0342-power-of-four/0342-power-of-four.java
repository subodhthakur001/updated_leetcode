class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;
        int temp = n;
        while(temp>1){
            if(temp%4!=0){
                return false;
            }
            temp=temp/4;
        }
        return true;
    }
}