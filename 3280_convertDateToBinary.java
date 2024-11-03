class Solution {
    public String convertDateToBinary(String date) {
        String[] arr=date.split("-");
        String k="";
        for(String n:arr){
            k+=Integer.toBinaryString(Integer.parseInt(n))+"-";
        }
        return k.substring(0,k.length()-1);
    }
}
