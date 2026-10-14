class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        StringBuilder rev = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            if(Character.isLetter(s.charAt(i))){
                rev.append(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        int j=0;
        for(int i=0;i<n;i++){
             if(Character.isLetter(s.charAt(i))){
                ans.append(rev.charAt(j));
                j++;
             }
             else{
                ans.append(s.charAt(i));
             }
        }
        return ans.toString();
    }
}