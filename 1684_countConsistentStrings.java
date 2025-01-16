class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int f=0;
        int c=0;
        for(int i=0;i<words.length;i++){
            f=0;
            for(int j=0;j<words[i].length();j++){
                if(!allowed.contains(words[i].charAt(j)+"")) {f=1;break;}
            }
            if(f==0) c+=1; 
        }
        return c;

    }
}
