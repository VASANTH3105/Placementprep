import java.util.Scanner;

 

class Solution {

 

    static String reverseStringWordWise(String input) {

        // Write your code here

        String[] arr = input.split(" ");

        StringBuffer str = new StringBuffer();

        for(int i = arr.length-1;i >= 0;i--){

            str.append(arr[i]);

            str.append(" ");

        }

        return str.toString();

    }

 

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String ans = reverseStringWordWise(input);

        System.out.println(ans);

    }

}
