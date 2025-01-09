class Solution {
    public int prefixCount(String[] words, String pref) {
        int s=0;
        System.out.println(words.length);
        for(String word:words){
            if (pref.length()<=word.length()&&word.substring(0,pref.length()).equals(pref)){
            s+=1;
        
            }
        }
        return s;
    }
}
