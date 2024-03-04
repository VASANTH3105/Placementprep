//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
        // code here
        int l = 0;
        int r = arr.length - 1;
        while(l<=r) {
            int mid = l + ( r - l) / 2;
            if(k == arr[mid]) return mid;
            if(arr[mid] < k) {
                l = mid+1;
            }
            if(arr[mid] > k){
                r = mid-1;
            }
        }
        return -1;
    }
}
