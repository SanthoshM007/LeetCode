class Solution {
    public void setZeroes(int[][] mat) {
    //     int rw=mat.length,cn=mat[0].length;
    //     for(int i=0;i<rw;i++){
    //         for(int j=0;j<cn;j++){
    //             if(mat[i][j]==0){
    //                 mrkrw(i,mat);
    //                 mrkcn(j,mat);
    //             }
    //         }
    //     }
    // //System.out.print(-0);
    //    for(int i=0;i<rw;i++){
    //         for(int j=0;j<cn;j++){
    //             if(mat[i][j]==-1){
    //                 mat[i][j]=0;
    //             }
    //         }
    //     }
    // }

    //     public static void mrkrw(int rw,int[][] mat){
    //         for(int i=0;i<mat[0].length;i++){
    //             if(mat[rw][i]!=0)
    //             mat[rw][i]=-1;
    //         }
    //     }

    //     public static void mrkcn(int cn,int[][] mat){
    //         for(int i=0;i<mat.length;i++){
    //             if(mat[i][cn]!=0)
    //             mat[i][cn]=-1;
    //         }
    //     }
    
    int[] column=new int[mat[0].length];
    int[] row=new int[mat.length];
    
    for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==0){
                row[i]=1;
                column[j]=1;
            }
        }   
    }

    // for(int i=0;i<row.length;i++){
    //    System.out.println(row[i]); 
    // }
    // System.out.println("---");
    // for(int i=0;i<column.length;i++){
    //    System.out.println(column[i]); 
    // }
    for(int i=0;i<row.length;i++){
        if(row[i]==1){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=0;
            }
        }   
    }

    for(int i=0;i<column.length;i++){
        if(column[i]==1){
            for(int j=0;j<mat.length;j++){
                mat[j][i]=0;
            }
        }   
    
    }}
}
