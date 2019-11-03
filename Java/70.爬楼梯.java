class Solution {
    /**
    当需要爬n个台阶时，将结果拆分成爬n-1(走1步)和n-2(走两步)
    */
    public int climbStairs1(int n) {
        //递归解法
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairs(int n) {
        int f1 = 1, f2 = 2, res = 0;
        if(n == 0) return 0;
        if(n == 1) return f1;
        if(n == 2) return f2;
        for(int i = 3;i < n+1; i++){
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }
    
}