import java.util.* ;

 

import java.io.*; 

 

public class Rectangle { 

 

    // Write your code here.

 

    int length;

 

    int breadth;

 

    int getArea() {

 

        return length*breadth;

 

    }

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        Rectangle r=new Rectangle();

        r.length=sc.nextInt();

        r.breadth=sc.nextInt();

        System.out.println(r.getArea());

    }
}
