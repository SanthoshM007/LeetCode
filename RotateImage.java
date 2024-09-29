class Solution {
    public void rotate(int[][] mat) {
        int t=0;
        int l=1;
        for(int k=0;k<mat.length;k++){
            for(int j=l;j<mat.length;j++){
                t=mat[j][k];
                mat[j][k]=mat[k][j];
                mat[k][j]=t;
            }
            l+=1;
        }
       
        for(int i=0;i<mat.length;i++){
            int k=mat.length-1;
            for(int j=0;j<mat.length/2;j++){
                t=mat[i][k];//3 9
                mat[i][k]=mat[i][j];//1
                mat[i][j]=t;//3
                k-=1;
            }
        }
        
    }
    
    
}
