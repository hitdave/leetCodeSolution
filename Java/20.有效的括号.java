class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n == 0) return true;
        Stack<Character> sk = new Stack<>();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                sk.push(c);
            }else if(!sk.isEmpty() && isMatch(sk.peek(),c)){
                sk.pop();
            }else{
                return false;
            }
        }
        return sk.isEmpty();
    }

    public static boolean isMatch(Character c1, Character c2){
        if(c1=='(' && c2 ==')')return true;
        if(c1=='[' && c2 ==']')return true;
        if(c1=='{' && c2 =='}')return true;
        return false;
    }
}