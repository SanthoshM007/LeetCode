class Solution {
    public int wateringPlants(int[] pl, int cap) {
        
        int r=-1;
        double s=0;
        int t=cap;
        for(int i=0;i<pl.length;i++){
            if(cap-pl[i]<0){
                r=-1;
                s+=Math.sqrt(Math.pow(r - (i-1), 2) + Math.pow(0 - 0, 2));
                cap+=t-cap;
            }
            cap-=pl[i];
            s+=Math.sqrt(Math.pow(i - r, 2) + Math.pow(0 - 0, 2));
            r=i;

        }

        return (int)s;
    }
}
