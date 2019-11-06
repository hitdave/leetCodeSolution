class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int ans = 0;
        int i  = n-1;
        while(i >=0 && s.charAt(i)==' '){
            i--;
        }
        if(i < 0){
            return 0;
        }
        while(i>=0 && s.charAt(i) != ' '){
            ans++;
            i--;
        }
        return ans;

    }
}