class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<int,int> mp;
        int n = s.size();
        int i = 0, left = -1, res = 0;
        for(int i =0; i < n; i++){
            if(mp.count(s[i]) && mp[s[i]]>left){
                left = mp[s[i]];
            }
            res = max(res, i - left);
            mp[s[i]] = i;
        }
        return res;
    }
};