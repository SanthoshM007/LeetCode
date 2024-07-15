class Solution {
    public boolean canConstruct(String r, String m){
        int c=0;
StringBuilder sb = new StringBuilder(m);

        for(int i=0;i<r.length();i++){
            for(int j=0;j<sb.length();j++){
                    if(r.charAt(i)==sb.charAt(j))
                    {
                        sb.setCharAt(j, '$'); 
                        c+=1;
                        break;
                    }
                   
                    if(c==r.length()) break;
            }
           
                
        }
        if(c==r.length()) return true;
         else return false;
    }
}
