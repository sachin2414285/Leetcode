class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
       List<List<Integer>> ans=new ArrayList<>();
       Arrays.sort(nums);
       for(int i=0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        // for(int j=i+1;j<n-1;j++){
        //   if(j>i+1 && nums[j]==nums[j-1]){
        //     continue;
           // }
            int j=i+1;
            int k=n-1;
            while(k>j){
            long sum= (long)nums[i]+nums[j]+nums[k];
            if(sum==0){
                ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                j++;
                k--;
               while(k>j && nums[j]==nums[j-1]){
                j++;
               }
               while(k>j && nums[k]==nums[k+1]){
                k--;
               }
            }
            else if(sum>0){
                k--;
            }
            else{
                j++;
            }
       }
       }
return ans;
}}

// same as 3SUM   TC=O(n^2)