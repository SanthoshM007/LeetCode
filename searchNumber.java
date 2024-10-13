class Solution {
    public int search(int[] nums, int t) {
        int i=0,j=(nums.length/2)/2;
        int k=j,l=nums.length/2;
        
        int m=nums.length/2,n=((nums.length/2)/2)+nums.length/2;
        int o=n,p=nums.length;

        while(i<j||k<l||m<n||o<p){
            if(i!=j){if(t==nums[i]) return i;i+=1;}

            if(k!=l){if(t==nums[k]) return k;k+=1;}
            
            if(m!=n){if(t==nums[m]) return m;m+=1;}

            if(o!=p){if(t==nums[o]) return o;o+=1;}

        }
        return -1;
    }
}
