class Solution {
    public boolean isPalindrome(int x) {
        int digit = x;
        int rev = 0;
        if(x < 0) return false;  // if negative return false
        while(digit!=0) {
            int rem = digit % 10;  //splitting
            rev = (rev * 10) + rem; //reversing
            digit /= 10; //balance
        }
        return (rev == x); //returning true or false
    }
}
