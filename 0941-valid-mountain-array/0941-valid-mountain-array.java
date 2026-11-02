class Solution {
    public boolean validMountainArray(int[] arr) {
      int n=arr.length;
      int max=0;
    //   if(arr.length>=3){
    //     return false;
    //   }
      for(int i=1;i<n;i++){
          if(arr[max]<=arr[i]){
            max=i;
          }
      }
          if(max==0 || max==n-1){
            return false;
      }
      for(int i=0;i<max;i++){
        if(arr[i]>=arr[i+1]){
            return false;
        }
      }
      for(int j=max;j<n-1;j++){
        if(arr[j]<=arr[j+1]){
            return false;
        }
      }
      return true;
    }
}