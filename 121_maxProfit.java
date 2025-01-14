class Solution {
    public int maxProfit(int[] pri) {
        int st=pri[0];
        int en=pri[0];
        int st_ind=0;
        int en_ind=0;
        int mp=0;
        int p=0;
        for(int i=1;i<pri.length;i++){
            if(st>pri[i]) {st=pri[i];st_ind=i;}//1-1,
            if(st_ind>en_ind) {en=pri[st_ind];en_ind=st_ind;}
            if(en<pri[i]) {en=pri[i];en_ind=i;}
            p=en-st;
            if(p>mp) mp=p;

        }
   
        return mp;
    }
}
