int isSorted(int n, vector<int> a) {
    // Write your code here.
    
    int flag1 = 0;
    for(int i = 1 ; i < n ; i++) {
        int flag = a[i-1];
        if(a[i] < flag){
            flag1 = 1;
        } 
        else {
            flag++;
        }
    }
    if( flag1 == 1) return 0;
    else return 1;
}
