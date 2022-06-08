class Solution {
    
    public int removePalindromeSub(String str) {
      if(str==null || str.length()==0)
          return 0;
        
      int r=0;
      int l=str.length()-1;
      while(r<l){
          if(!(str.charAt(r++)==str.charAt(l--)))
              return 2;
      }
      return 1;
  }
}