class GFG {
    String longest(String names[], int n) {
        String largest = names[0];
        for(int i = 0 ; i < n ; i++) {
            if(names[i].length() > largest.length()) {
                largest = names[i];
            }
        }
        return largest;
    }
}
