class Solution {
    public int longestPalindrome(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        String t="";
        int cnt=0;
        int ind=-1;
        int f=0;
        for(int i=0;i<s.length();i++){
            t=""+s.charAt(i);
            cnt=0;
            ind=s.indexOf(t);
            if(map.containsKey(t)) continue;
                while(ind!=-1){cnt+=1;ind=s.indexOf(t,ind+1);}
            map.put(t,cnt);
        }
        if(map.size()==1){
            return map.get(t);
        }
        else{
            cnt=0;
            f=0;
            
            for(Integer v:map.values()){
               if(v%2==0) cnt+=v;
               else if(v%2!=0&&f==0) {cnt+=v;f=1;}
               else cnt+=v-1;
            }
        }
        return cnt;
        
    }
}
