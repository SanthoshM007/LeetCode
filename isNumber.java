class Solution {
    public boolean isNumber(String s) {
        int f=0;
        double u;
        if(s.equals("Infinity")||s.equals("-Infinity")||s.equals("+Infinity")||(s.charAt(s.length()-1)>='a'&&s.charAt(s.length()-1)<='z')||(s.charAt(s.length()-1)>='A'&&s.charAt(s.length()-1)<='Z'))
         return false;
        try{
            u=Double.parseDouble(s);
            f=1;
        }
        catch(Exception e){return false;}
        System.out.print(u);
       
        if(f==1) return true;
        else return false;
    }
}
