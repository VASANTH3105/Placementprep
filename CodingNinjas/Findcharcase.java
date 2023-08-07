import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		char lett = sc.next().charAt(0);
		if(lett>'A' && lett<='Z'){
			System.out.println(1);
		}else if(lett>'a' && lett<='z'){
			System.out.println(0);
		}else{
			System.out.println(-1);
		}
	}
}
