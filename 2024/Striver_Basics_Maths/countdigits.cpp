public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int digit = n;
        int count = 0;
        while(digit!=0)  {
            int rem = digit % 10;
            if(rem!=0 && n % rem == 0) {
                count++;
            }
            digit = digit/10;
        }
        return count;
    }
}
