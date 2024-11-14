class Solution {
    public boolean isBalanced(String nums) {
        int o=0,e=0;
        int s=0;
        for(int i=0;i<nums.length();i+=1){
            if(i%2==0) o+=nums.charAt(i)-'0';
            else e+=nums.charAt(i)-'0';

           
        }
        return o==e ? true : false;
    }
}
