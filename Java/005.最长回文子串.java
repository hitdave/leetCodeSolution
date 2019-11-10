class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0) return "";
        int left = 0, right = 0;
        for(int i = 0; i < n; i++){
            int len1 = extendstr(s, i ,i);
            int len2 = extendstr(s, i, i+1);
            int max = Math.max(len1,len2);
            if(max > right - left){
                left =  i - (max - 1) / 2;
                right = i + max/2;
            }
        }
        return s.substring(left,right+1);
    }

    public int extendstr(String s,int left,int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
}