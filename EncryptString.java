class Solution {
    public String getEncryptedString(String s, int k) {
           return s.substring(k%s.length(),s.length())+s.substring(0,k%s.length());
            
        
    }
}
