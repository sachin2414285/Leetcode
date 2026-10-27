class Solution {
    public boolean isValid(String s) {
        // String st = "";
        // for(int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);
        //     if(ch == '(' || ch == '{' || ch == '[') {
        //         st += ch;
        //     }
        //     else {
        //         if(st.length() == 0) {
        //             return false;
        //         }
        //         char last = st.charAt(st.length() - 1);
        //         if(ch == ')' && last != '(') {
        //             return false;
        //         }
        //         if(ch == '}' && last != '{') {
        //             return false;
        //         }
        //         if(ch == ']' && last != '[') {
        //             return false;
        //         }
        //         st = st.substring(0, st.length() - 1);
        //     }
        // }
        // return st.length() == 0;
    int n=s.length();      
        Deque<Character> st=new ArrayDeque<>();
        for( char ch : s.toCharArray()){
            if(ch=='(' || ch=='{'|| ch=='['){
                st.push(ch);
            }
        else{ 

             if(st.isEmpty()){
              return false;
            }
            else if(ch==')' && st.peek()!='('){
                return false;
            }
               else if(ch==']' && st.peek()!='['){
                return false;
            }
               else if(ch=='}' && st.peek()!='{'){
                return false;
            }
            st.pop();
        }
        }
        if(!st.isEmpty()){
         return false;
        }
        return true;
    }
}