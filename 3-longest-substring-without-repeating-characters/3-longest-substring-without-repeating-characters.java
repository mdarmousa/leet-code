class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int max = 1;
        
        int count = 0;
        int left = 0;
        HashSet<Character> charSet = new HashSet<Character>();
        for(int i=0; i < s.length(); i ++){
            while(charSet.contains(s.charAt(i))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(i));
            max = Math.max(max , i - left +1);
        }
        
        return max;
    }
}