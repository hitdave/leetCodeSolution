class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[32];
        for(char c:s.toCharArray()){
            map[c-'a']++;
        }
        for(char c:t.toCharArray()){
            map[c-'a']--;
        }
        for(int flag :map){
            if(flag!=0){
                return false;
            }
        }
        return true;
    }
}