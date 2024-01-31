void nLetterTriangle(int n) {
    // Write your code here.
    for(int i = 0 ; i < n ; i++) {
        char res = 65;
        for(int j = 1 ; j <= i+1 ; j++) {
            cout<<res<<" ";
            res++;
        }
        cout<<endl;
    }
}

void nLetterTriangle(int n) {
    // Write your code here.
    for(int i = 0 ; i < n ; i++) {
        char res = 65;
        for(int j = 0 ; j <= i ; j++) {
            cout<<char('A'+j)<<" ";
        }
        cout<<endl;
    }
}
