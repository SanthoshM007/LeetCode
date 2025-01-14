class Solution {
    public int maxSubArray(int[] nums) {

        //-2 0 1 1 -2 4 3 Kadane's algo

        int maxSum=nums[0];
        int sum=0;
        sum+=nums[0];
        if(sum>maxSum) maxSum=sum;
        if(sum<0) sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum) maxSum=sum;
            if(sum<0) sum=0;
        }
        return maxSum;
    }
}
