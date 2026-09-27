class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        // int [] ans=new int [2];
        // int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //     if(nums[i]==nums[j]){
        //         ans[count]=nums[i];
        //         count++;
        //     }
        // }
        // }
        // return ans;
        int count=0;
        int [] ans=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                ans[count]=nums[i];
                count++;
            }
            set.add(nums[i]);
        }
        return ans;
    }
}