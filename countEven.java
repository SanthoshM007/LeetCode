public class Solution {
    public static int countEven(int num) {
        int evenCount = 0;

        for (int i = 2; i <= num; i++) {
            int temp = i;
            int sumOfDigits = 0;

            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }

            if (sumOfDigits % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
    }

   
}
