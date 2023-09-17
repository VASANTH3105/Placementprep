#include<iostream>
using namespace std;

void recu(int i, int arr[], int n) {
    if(i >= n/2) return;
    
    int temp;
    temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;
    recu(++i, arr, n); // Use pre-increment operator (++i) here
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0; i < n ; i++) {
        cin>>arr[i];
    }
    recu(0, arr, n);
    for(int i = 0; i < n; i++) {
        cout<<arr[i]<<" ";
    }
    return 0;
}
