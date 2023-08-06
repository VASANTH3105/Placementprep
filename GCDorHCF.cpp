int calcGCD(int n, int m){
    // Write your code here.
    int &a = n, &b = m;
    while(n>0 && m>0){
        if(n>m){
            a = a%b;
        }else{
            b = b%a;
        }
    }
    if(a==0) return b;
    else return a;
}
