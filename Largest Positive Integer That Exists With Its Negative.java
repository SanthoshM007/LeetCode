class Solution {
    public int findMaxK(int[] nums) {

        int m=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]<0) continue;
                    if(Math.abs(nums[i])==nums[j]) if(m<nums[j]) m=nums[j];
                }
            }
        }
        return m;
        
        
    }
}
