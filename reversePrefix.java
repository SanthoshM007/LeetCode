class Solution {
    public String reversePrefix(String word, char ch) {
        int i=word.indexOf(ch);
        if(i==-1) return word;
        StringBuilder t=new StringBuilder(word.substring(0,i+1));
        t.reverse();
        return t.toString()+word.substring(i+1,word.length());
    }
}
