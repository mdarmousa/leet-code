/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution : GuessGame {
    public int GuessNumber(int n) {
        
        int l = 1;
        int r = n;
        
        int mid = l + ((r -l) /2);
        
        while(l <= r){
            int comp = guess(mid);
            if(comp == 0){
                return mid;
            }else if(comp == -1){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
            mid = l + ((r -l) /2);
        }
        
        return -1;
        
    }
}