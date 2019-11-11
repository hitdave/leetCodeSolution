class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs == null || strs.length == 0) return res;
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String orderdStr = String.valueOf(arr);
            if(!map.containsKey(orderdStr)){
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(orderdStr, temp);
            }else{
                map.get(orderdStr).add(str);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}