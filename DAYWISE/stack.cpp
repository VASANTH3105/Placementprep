#include<iostream>
using namespace std;

class Stack {
    private:
        int top;
        int arr[5];

    public:
        Stack () {
            top = -1;
            for(int i = 0 ; i < 5 ; i++) {
                arr[i] = 0;
            }
        }
        bool isEmpty() {
            if(top == -1) {
                return true;
            } else {
                return false;
            }
        }

        bool isFull() {
            if(top == 4) 
                return true;
            else
                return false;
        }

        void push(int val) {
            if(isFull()){
                cout<<"Stack overfull"<<endl;
            } else {
                 top++;
                 arr[top] = val;
            }
        }

        int pop () {
            if(isEmpty()){
                cout<<"Underflow"<<endl;
            } else {
                int popvalue = arr[top];
                arr[top] = 0;
                top--;
                return popvalue;
            }
        }
        int count() {
            return (top+1);
        }

        void change(int pos, int val) {
            arr[pos] = val;
            cout<<"Value changed at position: "<<pos<<endl;
        }

        void display() {
            for(int i = 4 ; i >=0 ; i--) {
                cout<<arr[i]<<endl;
            }
        }
};
int main() {
    Stack s1;
    int option, position, value;

    s1.push(5);
    s1.display();

    return 0;
}
