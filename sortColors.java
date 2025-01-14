class Solution {
    public void sortColors(int[] nums) {
        int zc=0,oc=0,tc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zc+=1;
            if(nums[i]==1) oc+=1;
            if(nums[i]==2) tc+=1;
        }
        int i=0;
        for(i=0;i<zc;i++){
            nums[i]=0;
        }
        int t=i;
        for(i=i;i<t+oc;i++){
            nums[i]=1;
        }

        for(i=i;i<nums.length;i++){
            nums[i]=2;
        }

    }
}
