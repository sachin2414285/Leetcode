class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int n= nums.length;
        int [] ans={-1,-1};
        int maxpro=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]+nums[j]==target && nums[i] > nums[j]){
                 int product=nums[i]*nums[j];
                if(product>maxpro){
                    maxpro=product;
                    ans[0]=i;
                    ans[1]=j;
                }
            }
            }
        }
            return ans;
    }
}