static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0 ;
        int right = 0;
        int count = 0;
        while(right < n) {
            count += arr[right];
            while(count > s && right < arr.length && left < right) {
                count -= arr[left];
                left++;
            }
            if(count == s) {
                list.add(left+1);
                list.add(right+1);
                return list;
            }
            right++;
        }
        list.add(-1);
        return list;
    }