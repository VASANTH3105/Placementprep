import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
	
	// Write your totalPrime function here
	public int totalPrime(int a, int b){
		int count = 0;
		for(int i = a ; i <= b ; i++) {
			boolean flag=false;
			for(int j = 2 ; j*j<=i;j++){
				if(i%j==0){
					flag=true;
					break;
				}
			}
			if(flag==false){
				count++;
			}
		}
		return count;
	}
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			
