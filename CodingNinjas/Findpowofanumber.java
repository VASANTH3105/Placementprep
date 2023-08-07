import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		for(int i = 0 ; i < power ; i++){
			if(power!=0){
				
				result = num*result;
			}
			
		}
		System.out.println(result);
		
	}
}
