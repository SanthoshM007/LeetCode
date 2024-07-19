class Solution {
    public int minimumOperations(int[] arr) {

        int op=0;
        int c=0,d=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]%3!=0){
            c=arr[i]+1;d=arr[i]-1;
            if(c%3==0||d%3==0){
                op+=1;
            }
        }
        
    }
    return op;
}
}
