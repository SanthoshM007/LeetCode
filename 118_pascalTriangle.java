class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> mat = new ArrayList<>();

       
        for(int i=0;i<numRows;i++){
            List<Integer> arr=new ArrayList<>();
            arr.add(1);
            for(int j=1;j<i;j++){
                // arr.add(NCR(i,j));
                arr.add(mat.get(i-1).get(j-1) + mat.get(i-1).get(j));
            }
            if(i==0) {mat.add(arr); continue;}
            arr.add(1);
            mat.add(arr);
          
        }
        return mat;
    }

    // public static int NCR(int n,int r){
    //     // 13 11, 13 12
    //     long sumN=1;
    //     long sumR=1;
       
    //     for(int i=1;i<=r;i++){
    //         sumN*=n;//3 
    //         sumR*=i;//1
    //         n-=1;//2
    //     }

    //     //System.out.println(a+":"+b+"=> "+sumN+" "+sumR);

    //     return (int)(sumN/sumR);
    // }
}
