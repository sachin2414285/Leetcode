class Solution {
    public int hIndex(int[] citations) {
       int n=  citations.length;
       Arrays.sort(citations);
       for(int i=0;i<n;i++){
        int total=n-i;
        if(total<=citations[i]){
            return total;
        }
       }
       return 0;
    }
}