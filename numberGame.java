class Solution {
    public int[] numberGame(int[] nums) {
        
        int min,in=0;
        int[] arr=new int[nums.length];
       for(int i=0;i<nums.length;i+=2){
            min=Arrays.stream(nums).min().getAsInt();
            arr[i+1]=min;
            in=ind(nums,min);
            nums[in]=Integer.MAX_VALUE;
            min=Arrays.stream(nums).min().getAsInt();
            arr[i]=min;
           in=ind(nums,min);
            nums[in]=Integer.MAX_VALUE;
       }
        return arr;
    }

public static int ind(int[] nums,int min){
    int i;
    for (i = 0; i < nums.length; i++) {
        if (nums[i] == min) break;
    }
    return i;
}
}
