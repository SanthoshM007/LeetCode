class Solution {
    public int titleToNumber(String columnTitle) {
        int s=0,b=0;
        
        for(int i=columnTitle.length()-1;i>=0;i--){
           char c=columnTitle.charAt(i);
            
                s+=(c-64)*Math.pow(26,b);
                b++;
            
        }
        return s;
        


    }
}
