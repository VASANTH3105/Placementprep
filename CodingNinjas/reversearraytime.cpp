#include <bits/stdc++.h>

#include <iostream>

using namespace std;

 

vector <int> rotate(int arr[],int n , int k){

vector <int> ans;

for(int i=k;i<n;i++){

ans.push_back(arr[i]);

}

for(int i=0;i<k;i++){

ans.push_back(arr[i]);

}

return ans;

}

 

void printary(vector<int> &arr,int n)

 

{

 

for(int i=0;i<n;i++)

 

{

 

cout<<arr[i]<<" ";

 

}

 

}

int main() {

 

int n, k;

 

cin >> n;

 

int arr[n];

 

for (int i = 0; i < n; i++)

 

{

 

cin >> arr[i];

}

 

cin >> k;

 

vector<int> r=rotate(arr, n, k);

 

printary(r, n);

 

return 0;

}
