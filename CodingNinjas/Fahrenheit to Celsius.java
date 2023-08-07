import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		int en = sc.nextInt();
		int diff = sc.nextInt();
		for(int i = st ; i < en ; i+=diff) {
			int celsius =(int)((i-32)*5/9.0);
			System.out.println(i+" "+celsius);
		}
		
	}
}
