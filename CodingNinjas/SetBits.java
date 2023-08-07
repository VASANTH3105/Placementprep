import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		 if(n==0)

        return 0;

        else

        return 1 + countSetBits(n &(n-1));
	}
}
