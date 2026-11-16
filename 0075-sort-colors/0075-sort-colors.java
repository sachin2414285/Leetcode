class Solution {
    public void sortColors(int[] nums) {
        // int n= nums.length;
        // int c0=0;
        // int c1=0;
        // int c2=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0){
        //         c0++;
        //     }
        //     else if(nums[i]==1){
        //         c1++;
        //     }
        //     else{
        //         c2++;
        //     } 
        // }
        // int j=0;
        // for(int i=0;i<c0;i++){
        //        nums[j]=0;
        //         j++;
        // }
        // for(int i=0;i<c1;i++){
        //        nums[j]=1;
        //         j++;
        //     }
        // for(int i=0;i<c2;i++){
        //         nums[j]=2;
        //         j++;
        // }


        int n=nums.length;
        int z=0;
        int o=0;
        int t=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
        int ind=0;
        for(int i=0;i<z;i++){
            nums[ind]=0;
            ind++;
        }
        for(int i=0;i<o;i++){
            nums[ind]=1;
            ind++;
        }
        for(int i=0;i<t;i++){
            nums[ind]=2;
            ind++;
        }
    }
}