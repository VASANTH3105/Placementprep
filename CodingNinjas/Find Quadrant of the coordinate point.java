import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int quad;
		char axis;
		if(a>0 && b>0) {
			System.out.println("1st Quadrant");
		}else if(a<0 && b>0){
			System.out.println("2nd Quadrant");
		}else if(a<0 && b<0){
			System.out.println("3rd Quadrant");
		}else if(a>0 && b<0){
			System.out.println("4th Quadrant");
		}else if(a>0 && b==0){
			System.out.println("x axis");
		}else if(a==0 && b>0){
			System.out.println("y axis");
		}else{
			System.out.println("Origin");
		}
		
	}
}
