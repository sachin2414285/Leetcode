class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        for(int i=0;i<n;i++){
            int tot=n-i;
            if(citations[i]>=tot){
                return tot;
            }
        }
        return 0;
    }
}