public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i = 0 ; i < n ; i++) {
          for(int j = 0 ; j < i ; j++) {
              System.out.print("*");
          }
          System.out.println();
      }
      for(int i = 0 ; i< n ; i++) {
          for(int j = n ; j > i ; j--) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
