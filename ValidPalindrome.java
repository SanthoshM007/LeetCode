class Solution {
    public boolean isPalindrome(String s) {

        
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        //s=s.toLowerCase();
        String r="";
        StringBuilder str=new StringBuilder();
        str.append(s);
        str.reverse();
        r=str.toString();
        if(s.equalsIgnoreCase(r))
        return true;
        else
        return false;
        
    }
}
