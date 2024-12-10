class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1;
        int m=c;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
               // System.out.println(m+" "+c);
                if(m<c) m=c;
                c=1;
                continue;
            }
            c+=1;
        }

     if(m<c) m=c;

        if(c==nums.length) return nums.length;

        return m;
    }
}
