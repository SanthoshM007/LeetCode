class Solution {
    public int maximumBeauty(int[] nums, int k) {
        int i=0;
        int cnt=1,m=cnt;
        int j=0;
        while(i<nums.length){
            cnt=1;
            j=i+1;
            for(int c=0;c<nums.length-1;c++){
                if(nums[j%nums.length]-k<=nums[i]&&nums[j%nums.length]+k>=nums[i]){
                    cnt+=1;
                }
                j+=1;
            }
            if(m<cnt) m=cnt;
            i+=1;
        }

        return m;
    }
}
