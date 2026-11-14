class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        // int n=nums.size();
        // int minsum=Integer.MAX_VALUE;
        // for(int i=0;i<n;i++){
        //    int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum=sum+ nums.get(j);
        //         int len=j-i+1;
        //         if(len>=l && len<=r && sum>0){
        //             minsum=Math.min(minsum,sum);
        //         }
        //         if(len>r){
        //             break;
        //         }
        //     }
        // }
        // if(minsum==Integer.MAX_VALUE){
        //     return -1;
        // }
        // else
        // return minsum;



    int n=nums.size();
    int minsum=Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum=sum+nums.get(j);
            int len=j-i+1;
            if(len>=l && len<=r && sum>0){
                minsum=Math.min(minsum,sum);
            }
        }
        }
        if(minsum==Integer.MAX_VALUE){
            return -1;
    }
    else
    return minsum;


    }
}