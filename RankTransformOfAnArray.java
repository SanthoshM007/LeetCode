class Solution {
    public int[] arrayRankTransform(int[] arr1) {

        int[] arr= arr1.clone();
        int[] a=new int[arr.length];
        if(arr.length==0) return a;
        int r=1;
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],r);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]) r+=1;
            map.put(arr[i],r);
        }
        for(int i=0;i<arr1.length;i++){
            a[i]=map.get(arr1[i]);
        }

        return a;
        
    }
    
}
