public class Solution {
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here

        for(int i = 1 ; i < size ; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
