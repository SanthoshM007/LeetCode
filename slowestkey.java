class Solution {
    public char slowestKey(int[] rt, String kp) {
        //HashMap<Integer,Integer> map=new Hashmap<>();
        int m=0;
        int cnt=0;
        int d=0;
        char c='\0';
        for(int i=0;i<rt.length;i++){
            // map.put(rt[i],rt[i]-d);
            cnt=rt[i]-d;
            //System.out.println(cnt);
            if(cnt>m) {
                m=cnt;
                c=kp.charAt(i);
            }
            else if(cnt==m){
                if(c>kp.charAt(i)) c=c;
                else c=kp.charAt(i);
            }
            d=rt[i];
        }
        //System.out.print(m);
        return c;
    }
}
