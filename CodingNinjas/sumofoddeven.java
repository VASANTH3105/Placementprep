import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc = new Scanner(System.in);
		int ipt = sc.nextInt();
		int counteve=0;
		int countodd=0;
		while(ipt!=0) {
			int temp = ipt%10;
			if(temp%2==0){
				counteve+=temp;
			}else{
				countodd+=temp;
			}
			ipt/=10;
		}
		System.out.println(counteve+" "+countodd);

		
	}
}
