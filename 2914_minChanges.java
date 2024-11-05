class Solution {
    public int minChanges(String s) {
        int c=0;
        for(int i=0;i<s.length()-1;i+=2){
            if(!(s.charAt(i)=='1'&&s.charAt(i+1)=='1'||(s.charAt(i)=='0'&&s.charAt(i+1)=='0'))) c+=1;
        }
        return c;
    }
}
