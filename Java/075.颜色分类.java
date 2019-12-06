class Solution {
    public void sortColors(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        int cur = 0;
        while (cur <= end) {
            if (nums[cur] < 1) {
                swapElement(nums, begin, cur);
                begin++;
                cur++;  // 从begin位置交换过来的元素一定是已经遍历过的元素
            } else if (nums[cur] > 1) {
                swapElement(nums, end, cur);
                end--;
                // 从end位置交换过来的元素我们并没有遍历过
            } else {
                cur++;
            }
        }
    }

    public void swapElement(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}