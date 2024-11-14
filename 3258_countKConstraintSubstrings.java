class Solution {
    public int countKConstraintSubstrings(String s, int k) {

        int c=0;
        
        for(int j=1;j<=s.length();j++){
            
            for(int i=0;i<s.length()-(j-1);i++){
                c+=fun(s.substring(i,i+j),k);
            }
        }
        return c;
    }
    public static int fun(String s,int k){
        int z=0,o=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') z+=1;
            else o+=1;
        }
        return (z<=k||o<=k) ? 1:0;
    }

}
