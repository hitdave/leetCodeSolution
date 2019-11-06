class Solution {
    //暴力法 两两组合，时间复杂度为O(n2)
    //双指针法前后移动，只需遍历一次O(N)
    public int maxArea(int[] height) {
        int n = height.length;
        if(n <= 1) return 0;
        int i = 0, j = n - 1;
        int max = 0;
        while(i != j){
            max = Math.max(max, ((j - i) * Math.min(height[i], height[j])));
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}