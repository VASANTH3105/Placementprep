#include <bits/stdc++.h> 
int largestElement(vector<int> &arr, int n) {
    // Write your code here.
    int pt = arr[0];
    for(int i = 0 ; i < n ; i++) {
        if(arr[i] > pt){
            pt = arr[i];
        }
    }
    return pt;
}
