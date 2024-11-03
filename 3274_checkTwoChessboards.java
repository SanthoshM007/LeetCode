class Solution {
    public boolean checkTwoChessboards(String co1, String co2) {
        byte a=0;
        byte b=0;
        // System.out.println(co1.charAt(0));
        // System.out.println(co1.charAt(1));
        // System.out.println(co2.charAt(0)-'a');
        // System.out.println(co2.charAt(1)-'a');
        if((co1.charAt(0)%2!=0&&co1.charAt(1)%2!=0)||(co1.charAt(0)%2==0&&co1.charAt(1)%2==0)) a=1;
        if((co2.charAt(0)%2!=0&&co2.charAt(1)%2!=0)||(co2.charAt(0)%2==0&&co2.charAt(1)%2==0)) b=1;
    
        
       

        //System.out.print(a+" "+b);
        if(a==b) return true;
        return false;
    }
}
