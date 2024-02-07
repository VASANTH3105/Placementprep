//https://docs.google.com/document/d/1I4y0lrGehRfKtsdAgThs12Gy0zJkmn_iK8PbtD6Y8yo/edit?usp=sharing
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        if(n <= 2) return 0;
        
        int maxleft = arr[0];
        int maxright = arr[n-1];
        int left = 1;
        int right = n-2;
        long trappingwater = 0;
        while (left <= right) {
            if(maxleft<maxright) {
                if(arr[left]>=maxleft) {
                    maxleft = arr[left];
                } else {
                    trappingwater += maxleft-arr[left];
                    
                }
                left++;
            } else {
                if(arr[right]>=maxright) {
                    maxright = arr[right];
                } else {
                    trappingwater += maxright - arr[right];
                    
                }
                right--;
            }
        }
        return trappingwater;
        
    } 
}
