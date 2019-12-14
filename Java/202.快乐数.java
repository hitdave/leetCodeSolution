class Solution {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7 || n == 10) return true;
        if(n < 10) return false;
        int sum = 0;
        while(n > 0){
            int bit = n%10;
            sum += bit*bit;
            n = n/10;
        }
        return isHappy(sum);
    }
}