class Solution {
    //dfs剪枝
    //1.排序 + 只添加>=元素 去重
    //2.对于单个元素大于target，直接return
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,new ArrayList<>());
        return res;
    }

    public void dfs(int[] candidates,int target,List<Integer> cur){
        if(target == 0){
            res.add(cur);
            return;
        }
        if(target < 0) return;
        for(int i = 0; i < candidates.length; i++){
            if(candidates[i] > target) return;
            List<Integer> temp = new ArrayList<>(cur);
            if(temp.size()>=1 && candidates[i] >= temp.get(temp.size()-1)){
                temp.add(candidates[i]);
                dfs(candidates,target - candidates[i], temp);
            }else if(temp.size() == 0){
                temp.add(candidates[i]);
                dfs(candidates,target - candidates[i], temp);
            }
        }
    }
}