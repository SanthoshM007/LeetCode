class Solution {
    public String removeStars(String s) {
        StringBuilder st=new StringBuilder("");
        String t="";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st.deleteCharAt(j-1);
                j-=1;
            }
            else{
                st.insert(j,s.charAt(i));
                j+=1;
            }
        }
        return st.toString();
    }
}
