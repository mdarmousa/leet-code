class Solution {
    public int maximumUniqueSubarray(int[] nums) {
      int max = 0;
      int sum = 0; 
        int left = 0;
        
      HashSet<Integer> seen = new HashSet<Integer>();  
       for(int i=0; i < nums.length; i ++){
           while(seen.contains(nums[i])){
               seen.remove(nums[left]);
               sum -= nums[left];
               left++;
           }
           sum += nums[i];
           seen.add(nums[i]);
           
           max= Math.max(max, sum);
           
           
       }
        
        return max;
      
    }
}