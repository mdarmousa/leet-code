class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] db = new int[cost.length];
        return Math.min(minCost(0, cost, db), minCost(1, cost, db));
    }
    
    private int minCost(int index, int[] cost, int[] db){
        // Exclude the cost for the last jumb
        if(index == cost.length -1 || index == cost.length -2){
            return cost[index];
        }
        
        if(db[index] != 0){
            return db[index];
        }
        
        db[index] = cost[index] + Math.min(minCost(index+1, cost, db), minCost(index+2, cost, db));
        return db[index];

    }
}