class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            int diff=0;
            ans[i]=prices[i];
            for(int j=i+1;j<n;j++){
                if(prices[i]>=prices[j]){
                    diff=prices[i]-prices[j];
                    ans[i]=diff;
                    break;
                }
                // else{
                //     ans[i]=prices[i];
                // }
            }
            diff=0;
        }
        return ans;
    }
}