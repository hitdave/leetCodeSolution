class Solution {
    //利用第7题，反转后，回文数仍然是原数字
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        return x == reverse(x);
    }

    public static int reverse(int x) {
        int ans = 0;
        while(x != 0){
            int r = x%10;
            if(ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
                return 0;
            }
            ans = ans *10 + r;
            x = x/10;
        }
        return ans;
    }
}