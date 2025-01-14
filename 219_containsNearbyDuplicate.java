class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<=(i+k);j++){
                if(j<nums.length && nums[i]==nums[j] && j-i<=k) return true;
            }
        }
        return false;

    }
}
