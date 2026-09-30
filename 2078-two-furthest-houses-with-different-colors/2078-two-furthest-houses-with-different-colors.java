class Solution {
    public int maxDistance(int[] colors) {
        int n= colors.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(colors[i]!=colors[0]){
                ans=Math.max(ans,i);
            }
        }
            for(int j=0;j<n-1;j++){
                if(colors[j] != colors[n-1]){
                  ans=Math.max(ans,n-j-1);
                }
            }
            return ans;
        }
}