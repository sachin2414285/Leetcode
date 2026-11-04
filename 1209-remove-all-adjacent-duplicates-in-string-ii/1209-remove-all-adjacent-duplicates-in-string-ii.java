class Solution {
    public String removeDuplicates(String s, int k) {
        int n=s.length();
        Deque<Character> st=new ArrayDeque<>();
        Deque<Integer> count=new ArrayDeque<>();
        for(char ch: s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                count.push(count.pop()+1);
            }
            else{
                st.push(ch);
                count.push(1);
            }
            if(count.peek()==k){
                st.pop();
                count.pop();
            }
        }
         StringBuilder str=new StringBuilder();
         while(!st.isEmpty()){
        //  str.append(st.peek());
        //   st.pop()
         char ch = st.pop();
            int c = count.pop();
            for (int i = 0; i < c; i++) {
                str.append(ch);
            }
         }
        return str.reverse().toString();
    }
}