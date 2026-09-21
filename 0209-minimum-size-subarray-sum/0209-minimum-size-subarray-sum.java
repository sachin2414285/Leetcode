class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n= nums.length;
        int left=0;
        int minleng=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                minleng=Math.min(minleng,i-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        return minleng==Integer.MAX_VALUE ? 0:minleng;
    }
}