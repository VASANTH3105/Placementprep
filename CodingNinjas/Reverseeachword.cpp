#include <bits/stdc++.h> 

#include <iostream>

#include <algorithm>

#include <cstring>

using namespace std;

 

string reverseEachWord(string input)

{

    // Write your code here

    string result;

    string word;

 

    int n = input.size();

 

    for(int i=0 ; i<n ; i++) {

 

        if(input[i] == ' ')

        {

            reverse(word.begin(), word.end());

            result += word+' ';

            word = "";

        }

        word += input[i];

        if(input[i+1] == '\0')

        {

            reverse(word.begin(), word.end());

            result += word;

            word = "";

        }

    }

 

    return result;

}

 

int main()

{

 

    string str;

    getline(cin, str);

    string ans = reverseEachWord(str);

    cout << ans << endl;

    ;

}
