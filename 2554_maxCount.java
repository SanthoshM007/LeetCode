class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        int i=0,j=(banned.length/2)/2,k=banned.length/2,l=(k+banned.length)/2;

        int nv=1;
        int f=0;
        int c=0;
        int s=0;
        while(nv<=n){
            f=0;
            i=0;j=(banned.length/2)/2;k=banned.length/2;l=(k+banned.length)/2;

            while(i<(banned.length/2)/2||j<banned.length/2||k<((banned.length/2)+(banned.length))/2||l<banned.length){
                if(i<(banned.length/2)/2) {
                    if(banned[i]==nv) {f=1;break;}
                 
                }
                if(j<banned.length/2) {
                    if(banned[j]==nv) {f=1;break;}
                  
                }
                if(k<((banned.length/2)+(banned.length))/2){
                    if(banned[k]==nv) {f=1;break;}
              
                }
                if(l<banned.length){
                    if(banned[l]==nv) {f=1;break;}
                   
                }

                i+=1;
                j+=1;
                k+=1;
                l+=1;
                
            }
            if(f==0){
                if(!(s+nv>maxSum)) {c+=1;s+=nv;}
            }
            nv+=1;
        }
               
        return c;
    }
}
