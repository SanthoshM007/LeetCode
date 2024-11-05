class Solution {
    public String compressedString(String w) {
        int i=0;
        int c=0;
        String l="";
        char t;
        while(i<w.length()){
            c=0;
            c+=1;
            t=w.charAt(i);
                while(i!=w.length()-1&&w.charAt(i)==w.charAt(i+1)){
                    if(c==9) break;
                    c+=1;
                    i+=1;
                }
            l+=""+c+t;
            //System.out.println(l);
            i+=1;
                        
        }
        return l; 
    }
}
