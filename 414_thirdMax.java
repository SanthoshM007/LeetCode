class Solution {
    public int thirdMax(int[] nums) {
        
        ArrayList<Integer> set=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))
            set.add(nums[i]);
        }
        Collections.sort(set);

        if(set.size()<3) return Collections.max(set);

        return set.get(set.size()-3);

    }
}
