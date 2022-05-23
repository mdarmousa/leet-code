public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        if (strs == null || strs.length < 1) return 0;
        int[][] dp = new int[m+1][n+1];
        int[][] nums = new int[strs.length][2];
        for (int i = 0; i < strs.length; ++i) {
            for (int j = 0; j < strs[i].length(); ++j) {
                ++nums[i][strs[i].charAt(j)-'0'];
            }
        }
        for (int[] num : nums) {
            for (int i = m; i >= num[0]; --i) {
                for (int j = n; j >= num[1]; --j) {
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i-num[0]][j-num[1]]);
                }
            }
        }
        return dp[m][n];
    }
}