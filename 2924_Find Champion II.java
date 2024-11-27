class Solution {
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> win=new HashSet<>();

        for(int i=0;i<n;i++){
            win.add(i);
        }

        for(int i=0;i<edges.length;i++){
                win.remove(edges[i][1]);
        }
        
        if(win.size()!=1) return -1;
        else return win.stream().findFirst().get();
    }
}
