class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int low = 0;
        int high = x;
        int sqrt = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
             sqrt = x / mid;
            if(sqrt == mid){
                return mid;
            }else if(sqrt < mid){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return high;
    }
}