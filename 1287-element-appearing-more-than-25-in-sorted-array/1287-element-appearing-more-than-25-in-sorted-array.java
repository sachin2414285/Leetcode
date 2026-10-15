class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int num=n/4;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>num){
                return arr[i];
            }
        }
        return -1;

    }
}