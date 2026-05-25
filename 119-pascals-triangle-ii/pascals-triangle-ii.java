class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> resRow=new ArrayList<>();
        resRow.add(1);
        for(int i=0;i<rowIndex;i++){
            List<Integer> newRow=new ArrayList<>();
            newRow.add(1);
        for(int j=1;j<resRow.size();j++){
            newRow.add(resRow.get(j-1)+resRow.get(j));
            
        }
        newRow.add(1);
            resRow=newRow;
        }
        
        return resRow;

    }
}