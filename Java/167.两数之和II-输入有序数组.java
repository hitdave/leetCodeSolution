class Solution {
    //由于已经有序，双指针遍历即可
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int n = numbers.length;
        if(n < 2) return res;
        int i = 0, j = n - 1;
        while(i < j){
            int sum = numbers[i] + numbers[j];
            if(sum == target){
                res[0] = i + 1;
                res[1] = j + 1;
                return res;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
        return res;
    }
}