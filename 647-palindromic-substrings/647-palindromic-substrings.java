class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        
        for(int i = 0; i < s.length(); i ++){
            count += subStringCount(s, i , i);
            count += subStringCount(s, i , i+1);
        }
        return count;
    }
    
    
    private int subStringCount(String str, int left, int right){
        int sum = 0;

        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            
            sum ++;        
            left --;
            right ++;
        }
        
        return sum;
    }
}