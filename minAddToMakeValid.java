class Solution {
    public int minAddToMakeValid(String s) {
        StringBuilder st=new StringBuilder(s);
        int i=0,f=0;
        while(true){
            f=0;
        for(i=0;i<st.length()-1;i++){
            if(st.charAt(i)=='('&&st.charAt(i+1)==')'){
                st.deleteCharAt(i+1);
                st.deleteCharAt(i);
                f=1;
            }
            }
              if(f==0) break;  
        }

        return st.length();
       
    }
}
