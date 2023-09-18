int rec(int n) {
    if(n==0) return n;
    if(n==1) return n;
    int temp = rec(n-1)+rec(n-2);
    return temp;
}
class Solution {
public:
    int fib(int n) {
        int ans = rec(n);
        return ans;

        
    }
};


/*
_____________
try 
if(n<=1){
return n;
_____________


F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
*/
