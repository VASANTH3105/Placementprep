void nBinaryTriangle(int n) {
    // Write your code here.
     for(int i = 0; i<n; i++){

        for(int j = 0; j<=i; j++){

            if(i%2==0 && j%2==0){      //Print 1 when i and j both are even

                cout<<"1 ";

            }

            else if(i%2!=0 && j%2!=0){   //Print 1 when i and j both are odd

                cout<<"1 ";

            }

            else{                      //On rest position print 0

                cout<<"0 ";

            }

        }

        cout<<endl;

    }
}
