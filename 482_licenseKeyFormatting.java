class Solution {
    public String licenseKeyFormatting(String s, int k){
        s=s.replace("-","");
        s=s.toUpperCase();
        System.out.print(s);
        int op=s.length()/k;
        int fp=s.length()%k;
        int tp=op+fp;
        int i=s.length()-1;
        String a="";
        int j=i-k;
       
        while(i>=0){
            while(i>j){
                a+=s.charAt(i);
                i-=1;
                if(i<0) break;
            }
            j=i-k;
            a+='-';
        }
        StringBuilder l=new StringBuilder(a);
        l.reverse();
        l.delete(0,1);
        
        return l.toString();
    }
}
