class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        int diff=0;;
        int max=0;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
           diff=nums[i]-nums[i-1];
        if(diff>max){
            max=diff;
        }
        }
        return max;
    }
}