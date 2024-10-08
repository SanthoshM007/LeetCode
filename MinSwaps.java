class Solution {
    public int minSwaps(String s) {
        int si= 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[')  si++;
            else if (si > 0)  si--;
        }
        return (si + 1) / 2;
    }
}
