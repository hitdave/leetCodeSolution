class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.size();
        int cnt = 0;
        int i = n - 1;
        while(i >=0 && s[i] == ' '){
            i--;
        }
        if(i < 0) return 0;
        while(i >=0 && s[i]!= ' '){
            cnt++;
            i--;
        }
        return cnt;
    }
};