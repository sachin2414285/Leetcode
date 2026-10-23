class Solution {
    public int maxSubArray(int[] nums) {
        // int n= nums.length;
        // int sum=0;
        // int maxs= Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     sum=sum+nums[i];

        //      if(sum>maxs){
        //         maxs=sum;
        //      }       
        //      if(sum<0){
        //         sum=0;
        //      }
        //       }
        //       return maxs;
        int n=nums.length;
        int sum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
        // int n=nums.length;
        // int sum=0;
        // int maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     sum=sum+nums[i];
        //     if(sum>maxsum){
        //         maxsum=sum;
        //     }
        //     else if(sum<0){
        //         sum=0;
        //     }
        // }
        // return maxsum;
    }
}