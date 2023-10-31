#include<iostream>
using namespace std;
int main() {
    int n;
    cin>>n;
    int arr[n];
    for(int i = 0 ; i < n ; i++) {
        cin>>arr[i];
    }
    //prefetching
    int hash[13] = {0};
    for(int i = 0 ; i < n ; i++) {
        hash[arr[i]]+=1;
    }
    cout<<"Total no to find"<<endl;
    int q;
    cin>>q;
    while(q--){
        int number;
        cout<<"This num to find"<<endl;
        cin>>number;
        //fetch
        cout<<"Presents no:"<<endl;
        cout<<hash[number]<<endl;
    }
    return 0;
}
