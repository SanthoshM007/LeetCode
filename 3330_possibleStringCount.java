class Solution {
    public int possibleStringCount(String w) {
        int c=1;
        //String k="";
        for(int i=0;i<w.length()-1;i+=1){
            if(w.charAt(i)==w.charAt(i+1)){
                c++;
            }
        }
        return c;
    }
}
