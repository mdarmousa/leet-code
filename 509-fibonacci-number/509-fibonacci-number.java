class Solution {
    public int fib(int n) {
        
        //Base Condition
        if(n==0)
            return 0;
        
        int dp[]=new int[n+1];
        
        //Assign starting elements -> 0,1
        dp[0]=0;dp[1]=1;
        
        //Run loop till n and store sum of last two elements in dp[i]
        for(int i=2;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        
        //return the F(n) value
        return dp[n];
    }
}