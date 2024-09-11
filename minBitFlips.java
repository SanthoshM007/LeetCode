class Solution {
    public int minBitFlips(int st, int go) {
        String s1="";
        String s2="";
        while(st!=0||go!=0){
            s1=st%2+s1;
            s2=go%2+s2;
            st/=2;
            go/=2;
        }
        int a=Math.abs(s1.length()-s2.length());
        for(int i=0;i<a;i++){
            if(s1.length()>s2.length()){
                s2='0'+s2;
            }
            else{
                s1='0'+s1;
            } 
        }
        System.out.print(s1+" "+s2);
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) c+=1;
        }
        return c;
        
        
    }
}
