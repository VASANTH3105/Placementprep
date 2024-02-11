class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            if(i+1 == arr[i]) l.add(i+1); //index starts with 0 mind it
        }
        return l;
    }
}
