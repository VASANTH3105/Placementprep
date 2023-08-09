import java.util.* ;
import java.io.*; 
public class Rectangle { 
    // Write your code here.
    public int length;
    public int breadth;

    public int getArea(){
        return length*breadth;
    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rct = new Rectangle();
        rct.length = sc.nextInt();
        rct.breadth = sc.nextInt();
        int sol = rct.getArea();
        System.out.print(sol);
    }
}
