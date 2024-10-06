class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        
        String t="";
        if(s1.length()>s2.length()) {t=s1;s1=s2;s2=t;}
        
        if(s1.length()==s2.length()){
            if(s1.equals(s2)) return true;
            else return false;
        } 


        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");

        if(arr1.length==1){
            if(s1.equals(arr2[0])||s1.equals(arr2[arr2.length-1]))
                return true;
            else return false;
        }

        //ArrayList<Integer> k=new ArrayList<>();
        //ArrayList<String> l=new ArrayList<>();
        String l="";
        int i=0;
        int g=0;
        for(int j=0;j<arr2.length;j++){
            if(i!=arr1.length){
            if(!(arr1[i].equals(arr2[j]))){
                if(j==arr2.length-1) {g=1;l+=arr2[j];}
                else l+=arr2[j]+" ";
            }
            else{
                i+=1;
            } 
            }
            else{
                if(j==arr2.length-1) {g=1;l+=arr2[j];}
                else l+=arr2[j]+" ";
            } 
        }
        //System.out.println(l);

        int u=0;
        while(u<arr1.length+1){
            String h="";
            String b="";
            for(int p=u;p<arr1.length;p++){
                if(p==arr1.length-1)
                h+=arr1[p];
                else h+=arr1[p]+" ";
            }
            for(int q=0;q<u;q++){
                 b+=arr1[q]+" ";
                
            }
            if(g==1) {if((b+l+" "+h).equals(s2)) return true;}
            System.out.println(b+l+h);
            if((b+l+h).equals(s2)) return true;
            u+=1;
        }
        return false;
    }
}
