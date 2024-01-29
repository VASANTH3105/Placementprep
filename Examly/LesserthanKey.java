// You are using Java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int key = s.nextInt();
        int c = 0;
        for(int i=0;i<n;i++){
            if(arr[i] < key)
            c++;
        }
        System.out.println(c);
    }
}


