class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if(rowIndex == 0) list.add(1);
        if(rowIndex == 1) {list.add(1);list.add(1);}
        if(rowIndex >= 2) {
            list.add(1);
            List<Integer> preList = getRow(rowIndex - 1);
            for(int i = 0; i < preList.size() - 1; i++) {
                list.add(preList.get(i) + preList.get(i + 1));
            }
            list.add(1);
        }
        return list;
    }
}