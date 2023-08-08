import java.util.List;
import java.util.Scanner;
public class Solution {

    
    public static void printNtimes(int n){
        // Write your code here.
        if(n==0){
        return ;
        }

        printNtimes(n-1);
        System.out.print("Coding Ninjas"+" ");
    }
}
