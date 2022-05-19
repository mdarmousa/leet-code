class Solution {
            int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    public int longestIncreasingPath(int[][] matrix) {
		// initialization
        int maxLength = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
		
		// iterate over each cell in the matrix
        for(int row = 0;row < matrix.length;row++){
            for(int col = 0;col < matrix[0].length;col++){
				// maximize the increasing length
                maxLength = Math.max(maxLength, getLongestIncreasingPath(row, col, -1, matrix, dp));
            }
        }
        
        return maxLength;
    }
    
    
    public int getLongestIncreasingPath(int row, int col, int prev, int[][] matrix, int[][] dp){
		// base cases
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] <= prev){
            return 0;
        }
        // if already visited
        if(dp[row][col] != 0){
            return dp[row][col];
        }
		
        int currMax = 0;
        // for each directions maxmize the longest increasing length
        for(int[] direction : directions){
            currMax = Math.max(currMax, getLongestIncreasingPath(row + direction[0], col + direction[1], matrix[row][col], matrix, dp));
        }
        // store it adding extra 1 for the current cell
        dp[row][col] = 1 + currMax;
        return dp[row][col];
	}
}