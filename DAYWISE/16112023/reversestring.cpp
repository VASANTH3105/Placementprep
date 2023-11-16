class Solution {
public:
    void reverseString(vector<char>& s) {
        int n = s.size();

        for(int i = 0 ; i < n/2 ; i++) {
            //traversing half is enough bz one increments swaps two char 
            swap(s[i], s[n-i-1]);
        }
    }
};
