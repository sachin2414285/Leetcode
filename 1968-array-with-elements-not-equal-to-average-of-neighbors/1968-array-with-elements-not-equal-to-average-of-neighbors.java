class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] ans=new int[n];
        int left=0;
        int right=(n+1)/2;
        for(int i=0;i<n;i++){
            if(i%2==0){
                ans[i]=nums[left];
                left++;
            }
            else{
                ans[i]=nums[right];
                right++;
            }
        }
        return ans;
        //2nd............
        //    int n = nums.length;
        //    Arrays.sort(nums);
        //    for(int i = 0;i<n-1;i+=2){
        //    int temp = nums[i];
        //     nums[i] = nums[i+1];
        //    nums[i+1] = temp;
        // }
        // return nums;
    }
}