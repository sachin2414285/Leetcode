class Solution {
    public int sumBase(int n, int k) {
        int val=0;
            while(n>0){
               int rem=n%k;
               val=val+rem;
                n=n/k;
            }
        return val;

    }
}