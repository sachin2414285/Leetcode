class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int subarr=0;
            for(int j=i;j<n;j++){
                subarr+=arr[j];
                if((i-j+1)%2!=0){
                    sum+=subarr;
                }
            }
        }
         return sum;
    }
}