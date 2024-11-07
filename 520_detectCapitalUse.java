class Solution {
    public boolean detectCapitalUse(String word) {
        char c,d;
        int c1,d1;
        if(word.length()==1){
            return true;
        }
        else{
            c=word.charAt(0);
            d=word.charAt(1);
            if(c>='a'&&c<='z') c1=1; else c1=0;
            if(d>='A'&&d<='Z') d1=0; else d1=1; 
        }

        if(c1==0&&d1==0){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='a'&&word.charAt(i)<='z') return false;
            }
            return true;
        }
        else if(c1==0&&d1==1){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A'&&word.charAt(i)<='Z') return false;
            }
            return true;
        }
        else if(c1==1&&d1==1){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)>='A'&&word.charAt(i)<='Z') return false;
            }
            return true;
        }
        return false;
    }
    
}
