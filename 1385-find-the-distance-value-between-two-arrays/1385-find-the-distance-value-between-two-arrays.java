class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr2);
        
        int result =0;
        for(int i = 0; i < arr1.length; i ++){
            int l = 0; 
            int r = arr2.length -1;
            int mid =  l + ((r - l)/2);
            boolean flag = false;
            while(l <= r){
                int value = Math.abs(arr1[i] - arr2[mid]);
                if(value <= d){
                    flag = true;
                    break;
                    
                }else if(arr2[mid]> arr1[i]){
                    r = mid -1;
                }else {
                    l = mid+1;
                }
                mid =  l + ((r - l)/2);
            }
            
            if(flag) {
                result ++;
            }
        }
        
        return arr1.length - result;
    }
}