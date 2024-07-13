class Solution {
    public int minOperations(int[] nums, int k) {

        int i=0,min,c=0;
        Arrays.sort(nums);
        while(true){
            min=nums[i];
            if(min<k) {
                    c+=1;
                    i++;
            }
            else break;
        }
        return c;
    }
}
