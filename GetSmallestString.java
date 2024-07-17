class Solution {
    public String getSmallestString(String s) {
        int i;
        int c,d,t;
        StringBuilder sb=new StringBuilder(s);
       for(i=0;i<sb.length()-1;i++){
        t=0;
            c=(int)sb.charAt(i);
            d=(int)sb.charAt(i+1);
            if(c%2==0&&d%2==0){
                if(c>d) {
                    t+=c;
                    sb.setCharAt(i,(char)d);
                    sb.setCharAt(i+1,(char)t);
                    break;
                }
            }
            else if(c%2!=0&&d%2!=0){
                if(c>d) {
                    t+=c;
                    sb.setCharAt(i,(char)d);
                    sb.setCharAt(i+1,(char)t);
                    break;
                }
            }
       }
        return sb.toString();
    }
}
