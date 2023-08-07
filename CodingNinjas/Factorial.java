import java.util.Scanner;
class Solution {
	static int fact(int n) {
		if(n==0)
		return 1;
		else
		return n*fact(n-1);
	}
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(fact(num));
	}
}
