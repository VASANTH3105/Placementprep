//coding ninjas
#include<iostream>
using namespace std;
int countDigits(int n){
    // Write your code here.
    int count=0,r;
    int temp = n;
    while(temp>0){
        r = temp%10;
        if(r != 0 && n%r==0){
            count+=1;
        }
        temp=temp/10;
    }
   return count;
}
int main() {
    int num;
    scanf("%d",&num);
    cout<<countDigits(num);
    return 0;
}

/*

336
6

*/
