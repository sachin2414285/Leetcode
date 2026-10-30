class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st=new ArrayDeque<>();
        int count=0;
        int n=s.length();
        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    count++;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.size()+count;
        // isme size ko iss leye add karte hai q ki last me stack me keval ) vala bhi bracket to ho sakta hai na
    }
}