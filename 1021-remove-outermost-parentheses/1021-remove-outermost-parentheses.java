class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int b = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (b > 0) {
                ans.append(ch);
                }
                b++;
         } 
            else {
                b--;
                if (b > 0) {
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}