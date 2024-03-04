//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
            if(a[i]<min) min = a[i];
            if(a[i]>max) max = a[i];
        }
        return new Pair(min, max);
    }
}
