class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int v=low;v<=high;v++){
            String s=String.valueOf(v);
        if(s.length()%2 !=0){
            continue;
        }
        int sum1=0;
        int sum2=0;
        int mid=s.length()/2;
        for(int i=0;i<mid;i++){
            sum1+=s.charAt(i)-'0';
        }
        for(int j=mid;j<s.length();j++){
            sum2+=s.charAt(j)-'0';
        }
        if(sum1==sum2){
            count++;
        }}
        return count;
    }
}