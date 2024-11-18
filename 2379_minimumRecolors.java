class Solution {
    public int minimumRecolors(String b, int k) {
        int m=Integer.MAX_VALUE,c=0;
        for(int i=0;i<=b.length()-k;i++){
            c=0;
            for(int j=i;j<k+i;j++){
                if(b.charAt(j)=='W')c+=1;
            }
            if(m>c) m=c;
        }
        return m;
    }
}
