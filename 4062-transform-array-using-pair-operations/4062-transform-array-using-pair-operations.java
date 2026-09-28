class Solution {
    public boolean canTransform(int[] source, int[] target) {
        int n=source .length;
        int m= target.length;
        long sum1=0;
        long sum2= 0;
        for(int i=0;i<n && i<m ;i++){
            sum1=sum1+source[i];
            sum2+=target[i];
        }
      return sum1==sum2;
    }
}