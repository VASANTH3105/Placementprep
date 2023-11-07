int getSecondLargest(vector<int> arr, int n) {
    int largest = arr[0];
    int secondLargest = -1;
    for(int i = 1 ; i < n ; i++) {
        if(arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] < largest && arr[i] > secondLargest) {
            secondLargest = arr[i];
        }
    }
    return secondLargest;
}

int getSecondSmallest(vector<int> arr, int n) {
    int smallest = arr[0];
    int secondSmallest = INT_MAX;
    for(int i = 1; i < n ; i++) {
        if(arr[i] < smallest){
            secondSmallest = smallest;
        smallest = arr[i];

        } else if (arr[i] != smallest && arr[i] < secondSmallest) {
        secondSmallest = arr[i];
        }
        
    }
    return secondSmallest;
}
vector<int> getSecondOrderElements(int n, vector<int> a) {
    // Write your code here.
    int secondLargest = getSecondLargest(a, n);
    int secondSmallest = getSecondSmallest(a, n);

    return {secondLargest, secondSmallest};

}
