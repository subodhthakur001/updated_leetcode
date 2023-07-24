class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x == 1)return 1;
        if(n%2<0){
            x=1/x;
            n = -1*n;
        }
        if(n%2==0) return myPow(x*x,n/2);
        else return x * myPow(x,n-1);
    }
}