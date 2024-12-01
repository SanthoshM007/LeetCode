class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(rev(nums[i]));
        }
        //System.out.println(rev(901849));
        return set.size();
    }
    public static int rev(int n){
        int s=0;
        int re=10;
        while(n!=0){
            s=re*s+(n%10);
            n/=10;
            
        }
        return s;
    }
}
