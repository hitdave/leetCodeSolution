class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0,left = -1;
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > left){
                left = map.get(s.charAt(i));
            }
            res = Math.max(res, i - left);
            map.put(s.charAt(i),i);
        }
        return res;
    }
}