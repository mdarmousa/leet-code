class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        long maxHC = horizontalCuts[0];
        
        for(int i = 1; i < horizontalCuts.length; i ++){
            maxHC = Math.max(maxHC, horizontalCuts[i] - horizontalCuts[i-1]);
        }     
         maxHC = Math.max(maxHC, h - horizontalCuts[horizontalCuts.length-1]);

            
            
            
       long maxVC = verticalCuts[0];
        
        for(int i = 1; i < verticalCuts.length; i ++){
            maxVC = Math.max(maxVC, verticalCuts[i] - verticalCuts[i-1]);
        }     
         maxVC = Math.max(maxVC, w - verticalCuts[verticalCuts.length-1]);
        
        
        return  (int) ((maxHC * maxVC) % 1000000007);
        
        
    }
}