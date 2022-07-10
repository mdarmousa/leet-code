class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] memo = new int[cost.length];
        return Math.min(minCost(0, cost, memo), minCost(1, cost, memo));
    }
    
    private int minCost(int index, int[] cost, int[] memo){
        // Exclude the cost for the last jumb
        if(index == cost.length -1 || index == cost.length -2){
            return cost[index];
        }
        
        if(memo[index] != 0){
            return memo[index];
        }
        
        memo[index] = cost[index] + Math.min(minCost(index+1, cost, memo), minCost(index+2, cost, memo));
        return memo[index];

    }
}