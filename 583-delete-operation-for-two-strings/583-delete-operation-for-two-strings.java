class Solution {
    public int minDistance(String s1, String s2) {
        int [][] memeo = new int[s1.length()+1][s2.length()+1];
        
        /*
        The equation works because in case of complete mismatch(i.e. if the two strings can't be                 equalized at all), the total number of delete operations required will be m + nm+n. Now, if there is a         common sequence among the two strings of length lcslcs, we need to do lcslcs lesser deletions in both         the strings leading to a total of 2lcs2lcs lesser deletions, which then leads to the above equation
        
        
        */
        return s1.length() + s2. length() - 2 * lcs(s1, s2, s1.length(), s2.length(), memeo);
    }
    
    public int lcs (String s1, String s2, int m , int n , int [][] memo){
        if(m==0 || n == 0){
            return 0;
        }
        if(memo[m][n] > 0){
             return memo[m][n];
        }
        
        
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + lcs(s1, s2, m -1, n-1 , memo);
        }else{
            memo[m][n] = Math.max(lcs(s1, s2, m ,n -1 , memo), lcs(s1, s2, m -1, n , memo));
            return memo[m][n];
        }
        
    }
}