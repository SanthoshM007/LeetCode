class Solution {
    public boolean isSubsequence(String s, String t) {
        String a="";
        int j=0;
        if(s.length()==0) return true;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                a+=""+t.charAt(i);
                j+=1;
            }
            if(j==s.length()) break;
        }
        if(a.equals(s)) return true;
        else return false;
    }
}
