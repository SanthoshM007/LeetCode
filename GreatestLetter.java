class Solution {
    public String greatestLetter(String s) {
        boolean[] lowercase = new boolean[26];
        boolean[] uppercase = new boolean[26];

      
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lowercase[c - 'a'] = true;
            } else if (Character.isUpperCase(c)) {
                uppercase[c - 'A'] = true;
            }
        }
        
        for (int i = 25; i >= 0; i--) {
            if (lowercase[i] && uppercase[i]) {
                return Character.toString((char) (i + 'A'));
            }
        }

        return "";
    }
}
