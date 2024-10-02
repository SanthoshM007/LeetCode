class Solution {
    public String intToRoman(int num) {
        String t="";
        int[] iarr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] sarr={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        int k=iarr.length-1;
        while(num!=0){
            for(int i=k;i>=0;i--){
                if(iarr[i]<=num){
                    num-=iarr[i];
                  
                    t+=sarr[i];
                    break;
                }
            }
        }
        return t;
    }
}
