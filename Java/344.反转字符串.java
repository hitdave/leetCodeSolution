class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        if(n == 0 || n == 1) return ;
        for(int i = 0; i < n/2; i++){
            swap(s,i,n-1-i);
        }
        return ; 
    }

    public static void swap(char[] s, int i ,int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        return ;
    }
}