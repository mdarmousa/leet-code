class Solution {
    public int[] searchRange(int[] nums, int target) {
     
        int[] targetRange = {-1, -1};
        boolean found1=false,found2=false;
        for (int i = 0,j=(nums.length-1);j>=0&&i < nums.length; j--,i++) {
           
            if (nums[i] == target && !found1) {
                targetRange[0] = i;
                found1 =true;
                
            }
            
            if(nums[j] == target&& !found2){
              targetRange[1] = j;
                found2 =true;

            }
        }

       

        return targetRange;
        
        
        
    }
}