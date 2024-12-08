class Solution {
    public int[] diStringMatch(String s) {
        int[] arr=new int[s.length()+1];
        int j=0,k=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') {arr[i]=j;j+=1;}
            else {arr[i]=k;k-=1;}
        }
        arr[s.length()]=k;
        return arr;

    }
}
