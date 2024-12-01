class Solution {
    public int calPoints(String[] ope) {
        int s=0;
        

        ArrayList<Integer> ar=new ArrayList<>();

        for(int i=0;i<ope.length;i++){
            
            if(ope[i].equals("+")){
                ar.add(ar.get(ar.size()-1)+ar.get(ar.size()-2));
            }
            else if(ope[i].equals("D")){
               ar.add(2*ar.get(ar.size()-1));
            }
            else if(ope[i].equals("C")){
               ar.remove(ar.size()-1);
            }
            else{
                ar.add(Integer.parseInt(ope[i]));
            }


        }
        for(int n=0;n<ar.size();n++){
            s+=ar.get(n);
        }
        return s;
    }
}
