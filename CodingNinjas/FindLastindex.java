import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int find = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] == find){
				flag = i;
			}
		}
		if(flag!=0)
		System.out.println(flag);
		else
		System.out.println("-1");
		
	}
}
