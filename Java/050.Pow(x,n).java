class Solution {
    //出现StackOverFlow，原因就是n较大时，溢出
    public double myPow1(double x, int n) {
        if(n == 0) return 1.0;
        if(n == 1) return x;
        return myPow(x, n - 1) * x;
    }

    //时间超限
    public double myPow2(double x, int n) {
        if(n == 0) return 1.0;
        if(n == 1) return x;
        double res = 1.0;
        if(n < 0){
            x = 1/x;
            n = -n;
        }
        for(int i = 0; i < n; i++){
            res *= x; 
        }
        return res;
    }

    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        int t = n / 2;
        if(n < 0) {
            t = -t;
            x = 1 / x;
        }
        double res = myPow(x, t);
        if(n % 2 == 0) return res * res;
        return res * res * x;
    }
}