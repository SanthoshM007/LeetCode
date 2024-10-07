class Solution {
    public int removeElement(int[] nums, int val) {
        int t=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                d(nums,i);
                i-=1;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1) k+=1;
        }

        return k;
    }
    
    public static void d(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = -1;
    }
}
