class Solution {
    public int minimumChairs(String s) {
        int j=0;
        //System.out.println(s.lastIndexOf("E"));
        int k=1;
        for(k=1;k<=s.length();k++){
            j=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='E') j+=1;
                else j-=1;
                if(j>k) break;
            }
            if(j<=k) break;

        }
        return k;
    }
}
