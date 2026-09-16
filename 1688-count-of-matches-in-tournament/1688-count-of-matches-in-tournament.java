class Solution {
    public int numberOfMatches(int n) {
        int Count = 0;
        int matchPlay = 0;
        while(n!=1){
            if(n%2==0){
                matchPlay = n/2;
                n/=2;
            }
            else{
                matchPlay = (n-1)/2;
                n = (n-1)/2 + 1;
            }
            Count += matchPlay;
        }
        return Count;
    }
}