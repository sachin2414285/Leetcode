class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        int [] ans= new int[n];
        int max=-1;
        int val=-2;
        for(int i=n-1;i>=0;i--){ 
          max=Math.max(max,val);
          ans[i]=max;
         val=arr[i];
        }
        return ans;
    }
}