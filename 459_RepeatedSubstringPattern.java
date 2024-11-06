class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1) return false;
        String k="";
        int j=0;
        int l=0;
        String st=s;
        int m=s.length()/2;
        System.out.println(s.length()+" "+j+" "+k);
        while(true){
            int f=0;
            l=0;
            if(s.length()%2!=0){
            for(int i=s.length()/2;i>=1;i--){
                if(s.substring(0,i+1).equals(s.substring(i,s.length()-l))) {k=s.substring(0,i);j=i;f=1;break;}
                l+=2;
            }}
            else{
            for(int i=s.length()/2;i>=1;i--){
                if(s.substring(0,i).equals(s.substring(i,s.length()-l))) {k=s.substring(0,i);j=i;f=1;break;}
                l+=2;
            }}
            s=k;
            //System.out.println(j+" "+k);
            if(k=="") return false;
            
            int i1=0;
        
            while(i1<=st.length()-j){
            if(!st.substring(i1,i1+j).equals(k)) break;
            i1=i1+j;
            }
            if(i1==st.length()) return true;

            if(f==0) break;
        }
        
        if(k==""||st.length()%j!=0) return false;
        int i=0;
        
        while(i<=st.length()-j){
            if(!st.substring(i,i+j).equals(k)) return false;
            i=i+j;
        }
        return true;
        
    }
}
