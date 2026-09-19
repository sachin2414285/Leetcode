class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n= numbers.length;
        // ..... brute force....

        // int [] ans= new int[2];
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             ans[0]=i+1;
        //             ans[1]=j+1;
        //         }
        //     }        }
        //     return ans;


        //....using two pointer.....
    int [] ans= new int [2];
        int i=0;
        int j=n-1;
        while(j>i){
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(sum<target ){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}