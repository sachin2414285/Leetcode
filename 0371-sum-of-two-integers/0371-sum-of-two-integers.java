class Solution {
    public int getSum(int a, int b) {
        // int sum=0;
        // while(b!=0){
        //    int carr= (a&b)<<1;
        //       a=a^b;
        //       b=carr;
        // }
        // return a;




    //   int carr=0;
    //   while(b!=0){
    //     carr= (a&b)<<1;
    //      a=a^b;
    //      b=carr;
    //   }
    //   return a;















    while(a!=0){
        int carr=(a&b)<<1;
        b=a^b;
        a=carr;
    }
    return b;
    }
}