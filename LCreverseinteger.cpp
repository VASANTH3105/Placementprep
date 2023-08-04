/******************************************************************************
7. Reverse Integer

*******************************************************************************/
#include <iostream>

using namespace std;

int reverseNum(int x) {
    int tempx, rev = 0;
    tempx=x;
    while(tempx!=0) {
        int digit = tempx%10;
        tempx = tempx/10;
        rev = rev*10+digit;
    }
    return rev;
}

int main()
{
    int num;
    scanf("%d",&num);
    cout<<reverseNum(num);

    return 0;
}
