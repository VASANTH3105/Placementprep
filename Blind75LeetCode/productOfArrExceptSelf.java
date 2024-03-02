class Solution {
    public int[] productExceptSelf(int[] nums) {
        // [1, 2, 3, 4]
        int[] prefixproduct = new int[nums.length]; // 4
        prefixproduct[0] = 1;
        //calc prefix product
        for(int i = 1 ; i < nums.length ; i++) {
            prefixproduct[i] = prefixproduct[i-1] * nums[i-1];
            // pp[1] = 1 * 1 = 1
            // pp[2] = 1 * 2 = 2
            // pp[3] = 2 * 3 = 6
            // pp[] = [1, 1, 2, 6]
        }
        // D.P.
        //traverse from reverse
        int suffixproduct = 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--) {
            prefixproduct[i] = prefixproduct[i] * suffixproduct;
            suffixproduct = suffixproduct * nums[i]; 
        }

        return prefixproduct;

        
    }
}
