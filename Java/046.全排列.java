class Solution {
    //记忆化搜索
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0 || nums == null) return res;
        dfs(nums,new ArrayList<>(), new boolean[nums.length]);
        return res;
    }

    public void dfs(int[] nums, List<Integer> temp, boolean[] used){
        if(temp.size() == nums.length){
            res.add(temp);
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!used[i]){
                List<Integer> cur = new ArrayList<>(temp);
                cur.add(nums[i]);
                used[i] = true;
                dfs(nums,cur,used);
                used[i] = false;
            }
        }
        return;

    }
}