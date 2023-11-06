void selectionSort(vector<int>&arr) {

for(int i=0;i<arr.size()-1;i++){

int mini=i;

for(int j=i;j<arr.size();j++){

if(arr[mini]>arr[j])mini=j;

}


int temp = arr[i];
arr[i] = arr[mini];
arr[mini] = temp;

}

 

}
