class Solution {
    public int minLength(String s) {
        int ac=0;
        StringBuilder str=new StringBuilder(s);
        int l;
        while(true){
             l=str.length();
            for(int i=0;i<str.length()-1;i++){
                for(int j=i;j<i+2;j++){
                    {
                        if(((str.charAt(i+1)-str.charAt(i))==1)&&((str.charAt(i)=='A'&&str.charAt(i+1)=='B')||(str.charAt(i)=='C'&&str.charAt(i+1)=='D')))
                        str.delete(i,i+2);
                        break;
                    }
                }
                if(str.length()<l) break;
            }
            if(l==str.length()) break;
        }
        return str.length();
    }
}

                    
