class Solution {
    public long pickGifts(int[] gifts, int k) {
        int i=0,j=gifts.length-1;
        int m=0;
        int ind=0;
        long s=0;
        int fi=0,la=0;
        if(gifts.length%2==0){fi=(gifts.length/2)-1;la=gifts.length/2;}
        else {fi=gifts.length/2;la=gifts.length/2;}

        for(int l=0;l<k;l++){
            m=Arrays.stream(gifts).max().getAsInt();
            i=0;j=gifts.length-1;

            while(i<=fi&&j>=la){
                if(gifts[i]==m) {ind=i;break;}
                else if(gifts[j]==m) {ind=j;break;}
                i+=1;
                j-=1;
            }

            gifts[ind]=(int)Math.sqrt(m);
        }
        for(int a=0;a<gifts.length;a++){
            s+=gifts[a];
        }
        return s;

    }
}
