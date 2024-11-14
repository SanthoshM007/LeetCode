class Solution {
    public int finalPositionOfSnake(int n, List<String> com) {
        int j=0;
        for(String w:com){
            if(w.charAt(0)=='R') j+=1;
            else if(w.charAt(0)=='L') j-=1;
            else if(w.charAt(0)=='D') j+=n;
            else j-=n;
        }
        return j; 

    }
}
