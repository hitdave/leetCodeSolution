class Solution {
    Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
  }};

          
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return ans;
        dfs("",digits);
        return ans;
    }

    public void dfs(String combination, String nextDigits){
        if(nextDigits.length() == 0){
            ans.add(combination);
        }else{
            String str = nextDigits.substring(0,1);
            String value = phone.get(str);
            for(int i = 0; i < value.length(); i++){
                String letter = value.substring(i, i+1);
                dfs(combination + letter, nextDigits.substring(1));
            }
        }
    }
}