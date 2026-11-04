class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        Deque<Character> st= new ArrayDeque<>();
        if(n%2 !=0){
            return -1;
        }
        for(char ch: s.toCharArray()){
            if(ch==']' && !st.isEmpty() && st.peek()=='['){
                st.pop();
            }
            else{
                st.push(ch);
            }      
        }
     int open=0;
     int close=0;
     while(!st.isEmpty()){
        if(st.peek()==']'){
            close++;
        }
        else{
            open++;
        }
        st.pop();
     }
     int ans=(open+1)/2;
     return ans;
    }
}