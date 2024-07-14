class Solution {
    public int reverse(int x) {
   
        int INT_MIN = -2147483648;
        int INT_MAX = 2147483647;

        int reversed = 0;
        while (x != 0) {
           
            int digit = x % 10;
            x = x / 10;

            if (reversed > INT_MAX / 10 || (reversed == INT_MAX / 10 && digit > INT_MAX % 10)) {
                return 0;
            }
            if (reversed < INT_MIN / 10 || (reversed == INT_MIN / 10 && digit < INT_MIN % 10)) {
                return 0;
            }

           
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    }


        
