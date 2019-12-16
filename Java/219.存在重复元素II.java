class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        if(nums==null){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<len;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else {
                int diff = i - map.get(nums[i]);
                if(diff<=k){
                    return true;
                }else if(diff>k){
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}