import java.util.List;
import java.util.ArrayList;
public class Solution{
    public static List< Integer > printDivisors(int n) {
        // Write your code here
        List<Integer> newList = new ArrayList<Integer>();
        for(int i = 1 ; i <= n ; i++){
            if(n%i==0){
                newList.add(i);
            }
        }return newList;
    }
}
