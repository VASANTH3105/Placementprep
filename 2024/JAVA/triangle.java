
class Pattern {
    
    public  void ptn(int n) {
        for(int i = 0 ; i < n ; i++) {
	        for(int j = 0 ; j < n ; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
    }
    
    public void leftTri(int n) {
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void reverseTri(int n) {
        for(int i = 1 ; i <=n ; i++) {
            for(int j = n ; j >= i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //
    //  *
    //  **
    // ****
    //******
    public void triangle(int n) {
         for(int i = 0 ; i < n ; i++) {
        for(int j = 0 ; j < n-i-1 ; j++) {
            System.out.print(" ");
    }
    for(int j = 0 ; j < 2*i+1 ; j++) {
        System.out.print("*");
    }
    for(int j = 0 ; j < n-i-1 ; j++) {
        System.out.print(" ");
    }
    System.out.println();
    }
    }
}
public class Main
{
    
	public static void main(String[] args) {
	    Pattern pt = new Pattern();
	    //pt.ptn(5);
	    //pt.leftTri(5);
	    //pt.reverseTri(5);
	    pt.triangle(5);
	    
	}
}
