public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int lsum = 0;
    int rsum = 0;
    
    for(int i = 0 ; i < arr.size() ; i++) {
        for(int j = 0 ; j < arr.get(i).size() ; j++) {
            if(i == j) lsum += arr.get(i).get(j);
            if(i + j == arr.size() -1) rsum += arr.get(i).get(j);
        }
    }
    return Math.abs(lsum-rsum);

    }
