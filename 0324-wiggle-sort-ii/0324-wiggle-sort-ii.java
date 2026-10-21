class Solution {
    public void wiggleSort(int[] nums) {
        int n= nums.length;
    //     int[] ans=new int[nums.length];
    //     for (int i=0;i<nums.length;i++) {
    //      ans[i]=nums[i];
    //        }
    //     // even index prr value small hogi aur odd prr large value hogi
    //     Arrays.sort(nums);
    //     int left=(n-1)/2;
    //     int right=n-1;
    //     for(int i=0;i<n;i++){
    //         if(i%2==0){
    //             ans[i]=nums[left];
    //             left--;
    //         }
    //         else{
    //             ans[i]=nums[right];
    //             right--;
    //         }
    //     }
    //       for (int i=0;i<n;i++) {
    //         nums[i]=ans[i];
    // }
     int [] ans=nums.clone();
     Arrays.sort(ans);
        int left=(n-1)/2;
        int right=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=ans[left];
                left--;
            }
            else{
                nums[i]=ans[right];
                right--;
            }
        }
    }
}