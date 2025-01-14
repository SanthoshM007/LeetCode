class Solution {
    public void nextPermutation(int[] nums) {
        int ind=-1;
        for(int i=nums.length-2;i>=0;i--){
               if(nums[i]<nums[i+1]) {ind=i;break;}
        }

        if(ind==-1){
            int t=0;
            int j=nums.length-1;
            for(int i=0;i<nums.length/2;i++){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j-=1;
            }
            return;
        }
        int t=0;
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                t=nums[i];
                nums[i]=nums[ind];
                nums[ind]=t;
                break;
            } 
        }

        t=0;
            int j=nums.length-1;
            int s=((ind+1)+nums.length)/2;
            for(int i=ind+1;i<s;i++){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j-=1;
            }



        //System.out.println(ind);


        
    }
}
