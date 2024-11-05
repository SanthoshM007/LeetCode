class Solution {
    public String reverseVowels(String s) {
    StringBuilder t=new StringBuilder();
        char c;
        int in=s.length();
        int k=s.length();
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                k=fun(s.substring(0,in),k-1);
                t.append(s.charAt(k));
                in=k+1;
            }
            else
            t.append(c);
        }
        return t.toString();
    }
    public static int fun(String s,int k){
        char c;
        int i=k;
        for(i=k;i>=0;i--){
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') break;
        }
        return i;

    }
}
