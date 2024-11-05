class Solution {
    public int countSegments(String t) {
 
        char ch;
        int c=0;
        int i=0;
        int f=0;
        while(i<t.length()){
            ch=t.charAt(i);
            f=0;
            while(ch!=' '){
                f=1;
                i+=1;
                if(i<t.length()-1) ch=t.charAt(i);
                else break;
            }
            if(f==1) c+=1;
            i+=1;
        }
        return c;
    }
}
