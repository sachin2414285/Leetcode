class Solution {
    public int[] finalPrices(int[] prices) {
        // int n=prices.length;
        // int [] ans=new int[n];
        // for(int i=0;i<n;i++){
        //     int diff=0;
        //     ans[i]=prices[i];
        //     for(int j=i+1;j<n;j++){
        //         if(prices[i]>=prices[j]){
        //             diff=prices[i]-prices[j];
        //             ans[i]=diff;
        //             break;
        //         }
        //     }
        //     diff=0;
        // }
        // return ans;
       int[] answer = prices.clone();
        int n= prices.length;
        Deque<int []> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()[1]>= prices[i]){
                int dis=st.pop()[0];
                answer[dis]=answer[dis]-prices[i];
            }
            st.push(new int[]{ i,prices[i]});
        }
     return answer;
    }
}