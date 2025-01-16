class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[2];
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }

            if(map.get(nums[i])==2) {arr[j]=nums[i];j+=1;}

            if(arr[0]>0&&arr[1]>0) break;
        }

        //System.out.print(map);

        return arr;

    }
}
