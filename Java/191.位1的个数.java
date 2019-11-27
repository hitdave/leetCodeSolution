public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n == 0) return 0;
        int count = 0;
        int flag = 1;
        while(n != 0){
            if((n & 1) == 1) count ++;
            //无符号右移
            n = n>>>1;
        }
        return count;
    }
}