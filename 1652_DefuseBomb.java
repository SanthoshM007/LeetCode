class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr=new int[code.length];
        int f=Math.abs(k);
        int l=0;
        int c=0;
        
        if(k>0){
        for(int i=0;i<code.length;i++){
            c=0;l=0;
            for(int j=i+1;c<f;j++){
                l+=code[j%code.length];
                c+=1;
            }
            arr[i]=l;
        } 
        return arr;   
    }
        else if(k<0){
        for(int i=code.length-1;i>=0;i--){
            c=0;l=0;
            for(int j=i-1;c<f;j--){
                if(j<0) l+=code[code.length-(-j)];
                else l+=code[j%code.length];
                c+=1;
            }
            //System.out.println(l);
            arr[i]=l;
        }
        return arr; 
        }

        return arr;
    }
}
