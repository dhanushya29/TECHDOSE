public class weekly_309 {
    // class Solution {
        public:
            int dp[2001][1001];
            int numberOfWays(int stp, int ep, int k) {
                dp[1000][0] = 1;
                int mod = (int)1e9 + 7;
                for(int i = 0; i < k; ++i){
                    for(int j = 0; j < 2000; ++j){
                        if(j > 0)
                            dp[j - 1][i + 1] = (dp[j - 1][i + 1] + dp[j][i]) % mod;
                        dp[j + 1][i + 1] = (dp[j + 1][i + 1] + dp[j][i]) % mod;
                    }
                }
                return dp[1000 + abs(stp - ep)][k];
            }
        // };
}
