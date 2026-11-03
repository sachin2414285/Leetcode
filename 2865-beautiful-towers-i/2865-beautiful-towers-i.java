class Solution {
    public long maximumSumOfHeights(int[] heights) {
      int n=heights.length;
      long maxsum=0;
     for(int i=0;i<n;i++){
        long sum=heights[i];
        int prev=heights[i];
        for(int j=i-1;j>=0;j--){
            prev=Math.min(prev,heights[j]);
            sum+=prev;
        }
          prev=heights[i];
        for(int k=i+1;k<n;k++){
           prev=Math.min(prev,heights[k]);
           sum=sum+prev;
        }
        maxsum=Math.max(sum,maxsum);
     }
     return maxsum;
    }
}