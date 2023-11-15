//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution
{
    public:
    //Function to reverse words in a given string.
    string reverseWords(string S) 
    { 
    string S2;
    int len = S.length();
    for(int i = len ; i >=0 ; i--) {
        if(S[i] == '.'){
            int r = len-i;
            len = i-1;
            S2.append(S.substr(i+1, r));
            S2.append(".");
        }
    }
    S2.append(S.substr(0,len+1));
    return S2;
    
    }
};

//{ Driver Code Starts.
int main() 
{
    int t;
    cin >> t;
    while (t--) 
    {
        string s;
        cin >> s;
        Solution obj;
        cout<<obj.reverseWords(s)<<endl;
    }
}
// } Driver Code Ends
