class Solution {
    public boolean judgeSquareSum(int c) {
        long a= (long)Math.sqrt(c);
        long b=0;
        while(a>=b){
            long pos=a*a+b*b;
            if(pos==c){
                return true;
            }
            else if(pos>c){
                a--;

            }
            else{
                b++;
            }
        }
        return false;
    }
}