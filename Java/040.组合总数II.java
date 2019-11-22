class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length == 0) return res;
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>());
        return res;
    }

    public void dfs(int[] candidates, int target, int index,List<Integer> cur){
        if(target == 0){
            res.add(cur);
            return ;
        }
        if(target < 0) return ;
        if(index < candidates.length && candidates[index] > target) return;
        // if target > 0
        for(int i = index; i < candidates.length; i++){
            if(i!=0 && candidates[i] == candidates[i - 1] && i >= index + 1){
                continue;
            }else{
                List<Integer> temp = new ArrayList<>(cur);
                temp.add(candidates[i]);
                dfs(candidates,target - candidates[i],i+1,temp);
            }
            
        }
        return;
    }
}