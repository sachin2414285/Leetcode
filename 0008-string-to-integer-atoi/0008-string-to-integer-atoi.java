class Solution {
    public int myAtoi(String s) {
        //return Integer.parseInt(s);.........it is the function who convert into one line......

        int n=s.length();
        int i=0;
        while(n>i && s.charAt(i) == ' '){
        i++;}
        int sign=1;
       if(n>i && s.charAt(i)== '-'){
            sign=-1;
            i++;
        }
        else if(n>i && s.charAt(i)== '+'){
            sign=1;
            i++;
        }
         int ans=0;
        while(n>i && s.charAt(i)>='0' && s.charAt(i)<='9')
        {
        int dig= s.charAt(i)-'0';

            // .......overflow check.........
            if(ans > (Integer.MAX_VALUE - dig) / 10) {
                if(sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            ans=ans*10+ dig;
            i++;
        }
        return sign*ans;
    }
}