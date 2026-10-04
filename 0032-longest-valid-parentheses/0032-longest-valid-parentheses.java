class Solution {
    public int longestValidParentheses(String s) {
        int n= s.length();
        int count=0;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
         if(s.charAt(i) == '('){
            start++;
         }
         else {
            end++;
         }
         if(start==end){
            count= Math.max(count,2*start);
         }

         if(end>start){
            start=0;
            end=0;
         }
        }
        start=0;
        end=0;
        for(int i=n-1;i>0;i--){
            if(s.charAt(i) == '('){
            start++;
         }
         else {
            end++;
         }
         if(start==end){
            count= Math.max(count,2*start);
         }
         if(end<start){
            start=0;
            end=0;
         }
        }
        return count;
    }
}