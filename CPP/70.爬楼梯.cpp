class Solution {
public:
    int climbStairs(int n) {
        if(n == 0) return 0;
        int f1 = 1, f2 = 2;
        if(n == 1) return f1;
        if(n == 2) return f2;
        int res;
        while( n - 3 >= 0){
            res = f1 + f2;
            f1 = f2;
            f2 = res;
            n--;
        }
        return res;
    }
};