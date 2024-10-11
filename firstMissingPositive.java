class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0,j=nums.length/2;
        int ji=nums.length/2;
        int l=nums.length;
        
        HashSet<Integer> set=new HashSet<>();
        while(i<ji||j<l){
            if(i<ji){ 
                if(nums[i]>0) set.add(nums[i]);
                i+=1;
            }
            if(j<l){
                if(nums[j]>0) set.add(nums[j]);
                j+=1;
            } 
        }
        //int max = set.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
        //ArrayList<Integer> arr=new ArrayList<>(set);
        
         //Collections.sort(arr);
          //System.out.print(arr);
        int a=1;
        while(set.contains(a)){
            a+=1;
        }
        return a;

    }
}
