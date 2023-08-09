#include <bits/stdc++.h> 
#include <iostream>
#include <cstring>
using namespace std;

void printSubstrings(string input) {
    //Write your code here
    int n = input.size();
    for(int i = 0 ; i < n ; i++) {
        for(int j = i ; j < n ; j++) {
            string ans = input.substr(i,j-i+1);
            cout<<ans<<endl;
        }
    }
}

int main() {
    string input;
    getline(cin, input);
    printSubstrings(input);
    return 0;
}
