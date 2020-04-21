class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> res = {-1,-1};
        if(numbers.empty() || numbers.size() < 2) return res;
        int left = 0, right = numbers.size()-1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }else if(numbers[left] + numbers[right] > target){
                right--;
            }else{
                left++;
            }
        }
        return res;
    }
};