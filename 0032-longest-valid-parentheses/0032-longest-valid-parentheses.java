class Solution {
    public int longestValidParentheses(String s) {
        int n= s.length();
//         int count=0;
//         int start=0;
//         int end=0;
//         for(int i=0;i<n;i++){
//          if(s.charAt(i) == '('){
//             start++;
//          }
//          else {
//             end++;
//          }
//          if(start==end){
//             count= Math.max(count,2*start);
//          }

//          if(end>start){
//             start=0;
//             end=0;
//          }
//         }
//         start=0;
//         end=0;
//         for(int i=n-1;i>0;i--){
//             if(s.charAt(i) == '('){
//             start++;
//          }
//          else {
//             end++;
//          }
//          if(start==end){
//             count= Math.max(count,2*start);
//          }
//          if(end<start){
//             start=0;
//             end=0;
//          }
//         }
//         return count;
//     }
// }

// Stack<Integer> st= new Stack<>();
// st.push(-1);  // starting me -1 se dall dete hai..
// int maxlen=0;
// int length=0;
// for(int i=0;i<n;i++){
//     if(s.charAt(i)=='('){
//         st.push(i);
//     }
//     else{
//         st.pop();
//         if(st.isEmpty()){
//             st.push(i);
//         }
//         else{
//             length=i-st.peek(); // peek sabse uppar vale index ko dega...
//             maxlen=Math.max(length,maxlen);
//         }
//     }
// }
// return maxlen;

     Deque<Integer> st=new ArrayDeque<>();
     st.push(-1);
     int maxlength=0;
     for(int i=0;i<n;i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }
        else{
            st.pop();
            if(st.isEmpty()){
                st.push(i);
            }
            else{
             int length=i-st.peek();
             maxlength=Math.max(length,maxlength);
            }
        }
     }
     return maxlength;

    }
}