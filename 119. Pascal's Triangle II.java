class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        List<Integer> row=new ArrayList<>();
        row.add(1);
        for(int i=1;i<=rowIndex;i++){
            ans=ans*((rowIndex+1)-i);
            ans=ans/i;
            row.add((int)ans);
        }
        return row;
    }
}
