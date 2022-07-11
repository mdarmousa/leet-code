class Solution {
    public String convert(String s, int numRows) {
        
        StringBuilder [] resArray = new StringBuilder[numRows];
        
        
        
        int i = 0;
        while (i < s.length()){
            for(int j =0; j < resArray.length && i < s.length(); j ++ ){
                if(resArray[j] == null){
                   resArray[j] = new StringBuilder(); 
                } 
                
                resArray[j].append(""+s.charAt(i));
                i++;
            }
            for(int j = numRows -2; j > 0 && i < s.length(); j--){
                resArray[j].append(""+s.charAt(i));
                i++;
            } 
            
        }
        
        StringBuilder str = new StringBuilder();
        for(int j = 0; j < resArray.length; j++){
            if(resArray[j] != null){
                str.append(resArray[j].toString());
            }
        }
        
        return str.toString();
    }
    
}