class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        
        int max = 0; 
        for(int i = 0; i < boxTypes.length; i++){
            if(truckSize == 0){
                break;
            }
            int min  = Math.min(truckSize, boxTypes[i][0]);
            truckSize -= min;
            
            max += min * boxTypes[i][1];
            
        }
        
        return max;
    }
}