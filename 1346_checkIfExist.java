class Solution {
    public boolean checkIfExist(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            j=i+1;
            for(int c=0;c<arr.length-1;c++){
                if(2*arr[j%arr.length]==arr[i]) return true;
                j+=1;
            }
        }
        return false;
    }
}
