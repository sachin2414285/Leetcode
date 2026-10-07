class Solution {
    public char findTheDifference(String s, String t) {
        int n=s.length();
        int m=t.length();
        char ans = 0;
        for(int i=0;i<n;i++){
         ans=(char)(ans^s.charAt(i));
        }
        for(int i=0;i<m;i++){
            ans= (char) (ans^t.charAt(i));
        }
        return ans;
    }
}