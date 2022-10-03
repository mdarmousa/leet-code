class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        
        int left =0;
        int right = 0;
        
        
        while(left < neededTime.length && right < neededTime.length){
            
            int curentMax = 0;
            int currntTotal =0;
            while(right < neededTime.length && colors.charAt(left) == colors.charAt(right)){
                 currntTotal += neededTime[right];
                 curentMax = Math.max(curentMax, neededTime[right]);
                 right ++;
                
            }
            
            totalTime +=  currntTotal- curentMax;
            left = right;
            
        }
        

        
        return totalTime;
        
        
    }
}