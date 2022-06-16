public class Solution {
    public int Search(int[] nums, int target) {
       
        int l = 0;
        int r = nums.Length -1;
        int mid = l + ((r - l) / 2);
        while(l <= r){
            if(nums[mid] == target){
                return mid;
            }else  if(nums[mid] > target){
                r= mid -1;
                
            }else {
                l = mid +1;
            }
            mid = l + ((r - l) / 2);
            
        }
        
        
        
        return -1;
    }
}