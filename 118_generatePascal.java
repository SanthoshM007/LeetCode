class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            List<Integer> b = new ArrayList<>();
            b.add(1);
            for (int j = 0; j < i-1; j++) {
                b.add(a.get(i - 1).get(j) + a.get(i - 1).get(j+1));
            }
            
            if (i > 0) {
                b.add(1); 
            }
            a.add(b); 
        }
        
        return a;
    }
}
