class Solution {
    public int mySqrt(int x) {
        if(x ==1) return 1;
        long l =0;
        long r = x /2;
        long mid = l + (r-l)/2;
        while(l <=r){
            long sq = mid * mid;
            if(sq == x || (sq < x && (mid +1 * mid +1) > x)){
                return (int)mid;
            }
            else if(sq < x){
                l = mid +1;
            }else {
                r = mid -1;
            }
            mid = l + (r-l)/2;
            
        }
        
        return (int)mid -1;
    }
}