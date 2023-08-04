/******************************************************************************
9. Palindrome Number

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	static boolean isPalindrome(int x) {
	    if(x<0){
	        return false;
	    }
	    int temp = x;
	    int rev = 0;
	    while(temp!=0){
	        int digit = temp%10;
	        rev = rev*10+digit;
	        temp/=10;
	    }
	    return (rev == x);
    }
}
