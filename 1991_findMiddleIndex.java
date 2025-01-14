class Solution {
    public int findMiddleIndex(int[] nums) {
        int ind=-1;

        for(int i=0;i<nums.length;i++){
            int ls=0,rs=0;
            for(int j=0;j<nums.length;j++){
                if(j==i) continue;

                else if(i<j) rs+=nums[j];

                else ls+=nums[j];

            }

            if(rs==ls) return i;
        }

        return -1;

        
    }
}
