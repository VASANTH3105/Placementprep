
// } Driver Code Ends
class Solution{
    public:
    vector<int> sortArr(vector<int>arr, int n){
    //complete the function here
    vector<int> sol;
    sort(arr.begin(), arr.end());
    for(int i = 0 ; i < n ; i++){
        sol.push_back(arr[i]);
    }
    return sol;
    }
};
