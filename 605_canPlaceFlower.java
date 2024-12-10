class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int c=0;
        for(int i=0;i<fb.length;i++){

                if(i==0){
                    if(i+1>=fb.length) 
                    {if(fb[0]==0) {c+=1;break;} else break;}
                    if(fb[i]==0&&fb[i+1]==0)  {fb[i]=1;c+=1;}
                }
                else if(i==fb.length-1){
                     if(fb[i]==0&&fb[i-1]==0) {fb[i]=1;c+=1;}
                }
                else{
                    if(fb[i]==0&&fb[i+1]==0&&fb[i-1]==0) {fb[i]=1;c+=1;}
                }
        }

      
       
        return (n<=c)?true:false;


    }
}
