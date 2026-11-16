class Solution {
    public String decodeString(String s) {
        int num=0;
        Deque<Integer> digit=new ArrayDeque<>();
        Deque<StringBuilder> st=new ArrayDeque<>();
        StringBuilder curr=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');//  change string to digit
            }
            else if(ch=='['){
                digit.push(num);
                st.push(curr);
                num=0;
                  curr=new StringBuilder() ;
            }
            else if(ch==']'){
               StringBuilder prev=st.pop();
               int count= digit.pop();
               for(int i=0;i<count;i++){
                prev.append(curr);
               }
               curr=prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}