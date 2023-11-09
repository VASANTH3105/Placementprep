Leet code
class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        int max_so_far = nums[0];
        int max_end_here = 0;

        for(int i = 0 ; i < nums.size() ; i++) {
            max_end_here = max_end_here + nums[i];
            if(max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }

            if(max_end_here < 0) {
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
};


GFG pratice
class Solution {
public:
    int maxSubArray(vector<int>& nums) {

        int max_so_far = nums[0];
        int max_end_here = 0;

        for(int i = 0 ; i < nums.size() ; i++) {
            max_end_here = max_end_here + nums[i];
            if(max_so_far < max_end_here) {
                max_so_far = max_end_here;
            }

            if(max_end_here < 0) {
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
};
