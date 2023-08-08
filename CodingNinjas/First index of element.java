import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int find = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] == find){
				flag = i;
				break;
			}
		}
		if(flag!=0){
			System.out.print(flag);
		}
		else{
			System.out.print("-1");
		}
		
		
		
	}
}
