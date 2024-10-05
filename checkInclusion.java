class Solution {
    public boolean checkInclusion(String s1, String s2){
        
       int st=0;
        String t="";
        char[] arr1=s1.toCharArray();
        Arrays.sort(arr1);
        String m=new String(arr1);
        char[] arr;
        String l="";
        while(st<=s2.length()-s1.length()){
            t=s2.substring(st,s1.length()+st);
            arr=t.toCharArray();
            Arrays.sort(arr);
            l=new String(arr);
            if(l.equals(m)) return true;
            st+=1;
        }
        return false;
    }
}
