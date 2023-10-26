/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public void printArr(int[] arr, int n) {
        for(int i = 0 ; i < n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public void reverseArr(int[] arr, int n) {
        int p1 = 0 , p2 = n-1;
        while(p1<p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArr(arr, n);
    }
	public static void main(String[] args) {
	    int n = 5;
	    
	    int[] arr = {1,2,3,4,5};
	    Main obj = new Main();
	    obj.reverseArr(arr, n);
	    
	}
}
