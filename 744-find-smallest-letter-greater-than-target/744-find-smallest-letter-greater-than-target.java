class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l =0;
        int r = letters.length;
        
        while(l < r){
            int mid = l + (r-l)/2;
            
              
            if(letters[mid] <= target){
                l = mid +1;
            }else {
                r = mid;
            }
            
        }
        
        return letters[l%letters.length];
    }
}