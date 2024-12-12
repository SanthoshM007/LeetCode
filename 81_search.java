class Solution {
    public boolean search(int[] nums, int target) {
        int i1,i2,j1,j2,k1,k2,l1,l2;

        if(nums.length%2==0&&nums.length%4==0){
            i1=0;
            i2=((nums.length/2)/2)-1;
            j1=((nums.length/2)/2);
            j2=(nums.length/2)-1;
            k1=nums.length/2;
            k2=(((nums.length/2)+nums.length)/2)-1;
            l1=(((nums.length/2)+nums.length)/2);
            l2=nums.length-1;
        }
        // else if(nums.length%2==0&&nums.length%4!=0){
        //     i1=0;
        //     i2=((nums.length/2)/2);
        //     j1=((nums.length/2)/2);
        //     j2=(nums.length/2)-1;
        //     k1=nums.length/2;
        //     k2=(((nums.length/2)+nums.length)/2);
        //     l1=(((nums.length/2)+nums.length)/2);
        //     l2=nums.length-1;
        // }
        else{
            i1=0;
            i2=((nums.length/2)/2);
            j1=((nums.length/2)/2);
            j2=(nums.length/2);
            k1=nums.length/2;
            k2=(((nums.length/2)+nums.length)/2);
            l1=(((nums.length/2)+nums.length)/2);
            l2=nums.length-1;
        }

        while(i1<=i2&&j1<=j2&&k1<=k2&&l1<=l2){

            if(nums[i1]==target||nums[j1]==target||nums[k1]==target||nums[l1]==target) return true;
            i1+=1;
            j1+=1;
            k1+=1;
            l1+=1;
        }
        return false;
    }
}
