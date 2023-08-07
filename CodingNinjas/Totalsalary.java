import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		int allow ;
		Scanner sc = new Scanner(System.in);
		float sal = sc.nextFloat();
		char grade = sc.next().charAt(0);
		float hra = (sal*20)/100;
		float da = (sal*50)/100;
		float pf = (sal*11)/100;
		if(grade == 'A'){allow = 1700;}
		else if(grade == 'B'){allow = 1500;}
		else {allow = 1300;}
		float totsal = sal+hra+da+allow-pf;
		System.out.println(Math.round(totsal));
		
		
	}
}
