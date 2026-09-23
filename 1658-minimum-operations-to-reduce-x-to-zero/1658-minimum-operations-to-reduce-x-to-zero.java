class Solution {
    public int minOperations(int[] nums, int x) {
        int n= nums.length;
        int totalsum=0;
     for(int num :nums){
         totalsum +=num;
     }
     int target=totalsum-x;
     if(target<0){
        return -1;

     }
     int left=0;
     int sum=0;
     int maxlen=-1;
     for(int right=0;right<n;right++){
        sum=sum+nums[right];
         while(sum>target){
            sum-=nums[left];
            left++;
         }
         if(sum==target){
            int len=right-left+1;
         maxlen=Math.max(maxlen,len);
     }
     }
     if(maxlen==-1){
        return -1;
     }
     return nums.length-maxlen;
            
    }
}