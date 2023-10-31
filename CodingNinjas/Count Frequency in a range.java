Count Frequency in a range
public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int res[] = new int[n];
        for(int i = 0 ; i < n ;i++){
            if(nums[i]-1<n)
            res[nums[i]-1]++;
        }
        return res;
    }
}
