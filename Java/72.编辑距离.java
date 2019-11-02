class Solution {
     /**
     dp[i][j] = 
     / dp[i-1][j-1]                               if word1[i] == word2[j]
    / 1 + min(dp[i-1][j-1],dp[i][j-1],dp[i-1][j])            else
    */
    public int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();
        if(m*n == 0) return m+n;
        int[][] dp = new int[m+1][n+1];
        //初始化边界
        for(int i = 0; i < m+1; i++){
            dp[i][0] = i;
        }
        for(int j = 0;j < n+1; j++){
            dp[0][j] = j;
        }
        //dp矩阵计算
        for(int i = 1; i < m+1; i++){
            for(int j = 1; j < n+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1],
                    Math.min(dp[i][j-1], dp[i-1][j]));
                }
            }
        }
        //O(mn)
        return dp[m][n];

    }
}