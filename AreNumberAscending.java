class Solution {
    public boolean areNumbersAscending(String s) {
        
        String[] words=s.split(" ");
        ArrayList<Integer> n=new ArrayList<>();
        for(String word:words){
            try{
                n.add(Integer.parseInt(word));
            }
            catch(Exception e){continue;}
        }
        for(int i=0;i<n.size()-1;i++){
            if(n.get(i)>=n.get(i+1)) return false;
        }
        return true;
    }
}
