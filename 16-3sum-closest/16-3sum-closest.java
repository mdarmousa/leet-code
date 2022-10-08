class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closet = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0;i<n;i++){
            int tar = target - nums[i];
            int l = i+1;
            int h = n-1;
            while(l<h){
                int cur = nums[l] + nums[h];
                if(closet>Math.abs(target-(nums[i] + cur))){
                    result = nums[l]+nums[h]+nums[i];
                    closet = Math.abs(target - (cur+nums[i]));
                }
                if(cur==tar){
                    return target;
                }else if(cur>tar){
                    h--;
                }else{  
                    l++;
                }
            }
        }
        return result;
    }
}