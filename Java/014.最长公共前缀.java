class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";
        if(n == 1) return strs[0];
        int m = Integer.MAX_VALUE;
        //获取最短字符串
        for(String str : strs){
            m = Math.min(m, str.length());
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < m; i++){
            Character c = strs[0].charAt(i);
            for(String str : strs){
                if(str.charAt(i) != c) return sb.toString();
            }
            sb.append(c);
        }
        return sb.toString();
    }
}