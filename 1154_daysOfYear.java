class Solution {
    public int dayOfYear(String date) {
        int N=Integer.parseInt(date.substring(0,4));
        int M=Integer.parseInt(date.substring(5,7));
        int td=0;
        int d=Integer.parseInt(date.substring(8,10));
        if((N%4==0)&&(N%100!=0||N%400==0)){
            if(M==1) td=d;
            else if(M==2) td=31+d;
            else if(M==3) td=31+29+d;
            else if(M==4) td=31+29+31+d;
            else if(M==5) td=31+29+31+30+d;
            else if(M==6) td=31+29+31+30+31+d;
            else if(M==7) td=31+29+31+30+31+30+d;
            else if(M==8)  td=31+29+31+30+31+30+31+d;
            else if(M==9) td=31+29+31+30+31+30+31+31+d;
            else if(M==10) td=31+29+31+30+31+30+31+31+30+d;
            else if(M==11) td=31+29+31+30+31+30+31+31+30+31+d;
            else td=31+29+31+30+31+30+31+31+30+31+30+d;
        }
        else{
            if(M==1) td=d;
            else if(M==2) td=31+d;
            else if(M==3) td=31+28+d;
            else if(M==4) td=31+28+31+d;
            else if(M==5) td=31+28+31+30+d;
            else if(M==6) td=31+28+31+30+31+d;
            else if(M==7) td=31+28+31+30+31+30+d;
            else if(M==8)  td=31+28+31+30+31+30+31+d;
            else if(M==9) td=31+28+31+30+31+30+31+31+d;
            else if(M==10) td=31+28+31+30+31+30+31+31+30+d;
            else if(M==11) td=31+28+31+30+31+30+31+31+30+31+d;
            else td=31+28+31+30+31+30+31+31+30+31+30+d;
        }

      

        return td;


        
       
    }
}
