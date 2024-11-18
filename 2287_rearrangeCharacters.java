class Solution {
    public int rearrangeCharacters(String s, String tar) {
    StringBuilder k=new StringBuilder(s);
        int i=0,c=0,m=0;
        while(true){
            i=0;
            c=0;
            while(i<tar.length()&&k.indexOf(tar.charAt(i)+"")!=-1){
                k.deleteCharAt(k.indexOf(tar.charAt(i)+""));
                c+=1;
                i+=1;
            }
            if(c==tar.length()) m+=1;
            else break;
        }
        return m;
        
    }
}
