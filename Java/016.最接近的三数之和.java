class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if(n < 3) return -1;
        //同3sum，对数组排序
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        //i代表三个指针中的base
        for(int i = 0; i < n - 2; i++){
            int left = i + 1, right = n - 1;
            while(left < right){
                int newDiff = nums[i] + nums[left] + nums[right] - target;
                if(newDiff == 0) return target;
                if(Math.abs(diff) > Math.abs(newDiff)) diff = newDiff;
                if(newDiff > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return diff + target;
    }
}