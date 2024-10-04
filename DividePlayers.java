class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int j=skill.length-1;
        long sum=skill[0]+skill[skill.length-1];
        long p=0;
        for(int i=0;i<skill.length/2;i++){
            if(!((skill[i]+skill[j])==sum)) return -1;
            p+=skill[i]*skill[j];
            j-=1;
        }
        return p;
    }
}
