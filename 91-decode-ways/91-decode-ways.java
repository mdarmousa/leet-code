class Solution {
    /*
        11106
        
        1 1106 
            -> 1 1 106  
                  -> 1 1 10 6
               1 11 06   X
               
        11 106
            -> 11 1 06   X
               11 10 6
               
        [1, 1, 0, 0, 0 , 0, 0]        
    
    */
    
    
    
    public int numDecodings(String s) {
      
        if(s.length() == 0 || s.charAt(0) == '0') 
                return 0; 
        
        int[] dp = new int[s.length() +1];
        
        dp[0] = 1;
        dp[1]=s.charAt(0) !='0' ? 1:0; 
        for(int i = 2; i <= s.length(); i++){
            int indevidualNumber=Integer.valueOf(s.substring(i-1,i));
            int compinedNumber =Integer.valueOf(s.substring(i-2,i));
            if(indevidualNumber>=1 && indevidualNumber<=9){
                dp[i]+=dp[i-1];
            }
            if(compinedNumber>=10 && compinedNumber<=26){
                dp[i]+=dp[i-2];
            }
            
            
        }
        return dp[s.length()];
        
        
    }
}