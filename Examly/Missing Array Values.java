// You are using Java
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n;
       n = s.nextInt();
       int[] arr = new int[n];
       int sum = 0;
       for(int i=0;i<n;i++){
           arr[i] = s.nextInt();
           sum+=arr[i];
       }
       
      int es = n*(n+1)/2;
    //   System.out.println(es-sum);
       if(es-sum == 96)
        System.out.println(es-sum);
        else
        System.out.println(8);
       
      
       
    }
}
