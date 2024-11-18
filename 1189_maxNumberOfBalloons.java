class Solution {
    public int maxNumberOfBalloons(String text) {
        String tar="balloon";

        StringBuilder k=new StringBuilder(text);
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
