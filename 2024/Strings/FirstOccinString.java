class Solution {
    public int strStr(String haystack, String needle) {
        final int n = haystack.length();
        final int m = needle.length();

        for(int i = 0 ; i < n - m + 1; i++) {
            //loop stop before 3 character from last
            if(haystack.substring(i, i+m).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
