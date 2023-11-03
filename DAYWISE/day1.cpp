#include<iostream>
#include<string>
using namespace std;
void myName() {
    cout<<"VASANTH S"<<endl;
}

string myDept() {
    return "IT";
}

void wishes(string name) {
    cout<<"Hi, "<<name<<" believe yourself you can do it..."<<endl;
}

int add(int a, int b) {
    int c = a + b;
    return c;
} 

int square(int ipt) {
    return ipt*ipt;
}

int pbref(int *num) {
    int c = (*num)*(*num);
    return c;
}

int swap(int *num1, int *num2) {
    int temp;
    temp = *num1;
    *num2 = *num1;
    *num1 = temp;
    return;
}

int main() {
    //int, long, long long, float, double, 
    cout<<"Hi"<<endl;
    /*int a, b;
    cin>> a>> b;
    cout<<a<<" "<< b<<endl;*/
    string s;
    /*cin>>s;
    cout<<s<<endl;
    
    //Get multiple strings
    getline(cin, s);
    cout<<s<<endl;
    
    //256 char
    char ch;
    cin>>ch;
    cout<<ch<<endl;
    int age;
    cout<<"Enter your age"<<endl;
    cin>>age;
    if(age>=18){
        cout<<"Adult"<<endl;
    }else {
        cout<<"Not-Adult"<<endl;
    }
    
    //Grading system
    int marks;
    cout<<"Enter marks:";
    cin>>marks;
    cout<<endl;
    if(marks>=80 )
    cout<<"A"<<endl;
    else if(marks>=60 )
    cout<<"B"<<endl;
    else if(marks>=50 )
    cout<<"C"<<endl;
    else if(marks>=45 )
    cout<<"D"<<endl;
    else if(marks>=25 )
    cout<<"E"<<endl;
    else
    cout<<"F"<<endl;
        
        
    //eligible for job
    int jobAge;
    cout<<"Enter you age:";
    cin>>jobAge;
    if(jobAge<18) {
        cout<<"Not eligible"<<endl;
    }
    else {
        if(jobAge<=54){
            cout<<"Eligible for job"<<endl;
        }else if(jobAge<=57){
            cout<<"Eligible but soon to retirement"<<endl;
        }else{ 
            cout<<"Retirement time"<<endl;
        }
    }
    
    //switch
    int daynum;
    cout<<"Enter Day number:";
    cin>>daynum;
    switch(daynum){
        case 1:
        cout<<"Monday"<<endl;
        break;
        case 2:
        cout<<"Tuesday"<<endl;
        break;
        case 3:
        cout<<"Wednesday"<<endl;
        break;
        case 4:
        cout<<"Thursday"<<endl;
        break;
        case 5:
        cout<<"Friday"<<endl;
        break;
        case 6:
        cout<<"Saturday"<<endl;
        break;
        case 7:
        cout<<"Sunday"<<endl;
        break;
        default:
        cout<<"Enter crt daynum"<<endl;
    };
        
    //arrays
    int n;
    cout<<"Enter the size of array:";
    cin>>n;
    int arr[n];
    for(int i = 0 ; i < n ; i++){
        cin>>arr[i];
    }
    cout<<"Printing array"<<endl;
    for(int i = 0 ; i < n ; i++) {
        cout<<"Array index of "<<i<<" is: "<<arr[i]<<endl;
    }
    //Accessing the array index
    int access;
    cout<<"Enter number to find from array:";
    cin>>access;
    for(int i = 0 ; i < n ; i++) {
        if(arr[i] == access) {
            cout<<i<<endl;
        }
    }

    //2dArray

    //string
    string str = "Encyclopedia";
    cout<<"The string is:"<<str<<endl;
    cout<<str[2]<<endl;
    int len = str.size();
    cout<<"\nSize or length of string is:"<<len<<endl;
   
    int table, times;
    cout<<"Enter table: ";
    cin>>table;
    cout<<"Enter times:";
    cin>>times;
    for(int i = 0; i < times; i++) {
        cout<<table<<" * "<<i+1<<" = "<<table*i+1<<endl;
    }
     
    int fact = 5;
    int result = 1;
    for(int i = fact ; i>0 ; i--) {
        result*=i;
    }
    cout<<result<<endl;
    

    //while loop
    int i = 5;
    while(i) {
        cout<<i<<endl;
        i--;
    }

    //do while loop
    int i = 0;
    do{
        cout<<"Loading"<<i<<endl;
        i++;
    }
    while(i<=5);
    cout<<"Present i Value is:"<<i<<endl;// is 6 because it increments then only condition not executed 

    //functions
    cout<<"Your name is: ";
    myName();
    cout<<"Your dept is: "<<myDept()<<endl;
    string name;
    getline(cin, name);
    wishes(name);
    
    int num1, num2;
    cin>>num1>>num2; 
    cout<< add(num1, num2);
    

    //pass by value

    int a = 5;
    cout<<"A value inside"<<square(a)<<endl;
    cout<<"A value out: "<<a<<endl;

    int b = 10;
    cout<<"B value inside"<<pbref(&b)<<endl;
    cout<<"B value out:"<<b<<endl;

    int c = 10;
    cout<<"C val:"<<c<<endl;
    cout<<"C add:"<<&c<<endl;

    */


    int a = 100, b = 200;
    cout<<"Before swapping"<<endl;
    cout<<"A:"<<a<<" B:"<<b<<endl;
    swap(&a, &b);
    cout<<"After swapping"<<endl;
    cout<<"A:"<<a<<" B:"<<b<<endl;

    return 0;
}
