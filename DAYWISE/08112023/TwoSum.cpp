class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //given an array
        //add consecutive to get target
        vector<int> sol;
        for(int i = 0 ; i < nums.size() ; i++) {
            if (nums[i] + nums[i+1] == target){
                sol.push_back(i);
                sol.push_back(i+1);
                return sol;
            }
        }

        return {-1, -1};

    }
};

//CN-----------------------------------------------------------


string read(int n, vector<int> book, int target)
{
    // Write your code here.
    for (int i = 0 ; i < n ; i++) {
        for(int j = i+1 ; j < n ; j++) {
            if(book[i] + book[j] == target) return "YES";
        }
    }
    return "NO";

}

