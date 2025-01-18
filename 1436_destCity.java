class Solution {
    public String destCity(List<List<String>> paths) {
       HashMap<String,Integer> map=new HashMap<>();

       for(int i=0;i<paths.size();i++){
            if(!map.containsKey(paths.get(i).get(0)))
            map.put(paths.get(i).get(0),1);
            else{
                map.put(paths.get(i).get(0),map.get(paths.get(i).get(0))+1);
            }
            if(!map.containsKey(paths.get(i).get(1)))
            map.put(paths.get(i).get(1),0);
            else{
                map.put(paths.get(i).get(1),map.get(paths.get(i).get(0))+0);
            }
       }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==0) {
               return entry.getKey();
            }
        }
        return "";
    }
}
