class Solution {
    public long maximumScore(int[] nums) {
        int n=nums.length;
        long suffix[]=new long[n];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=Math.min(nums[i],suffix[i+1]);
        }
        long sum=0;
        long ans=Long.MIN_VALUE;
        for(int i=0;i<n-1;i++){
           sum+=nums[i];
           long score=sum-suffix[i+1];
           ans=Math.max(score,ans);
        }
        return ans;
    }
}