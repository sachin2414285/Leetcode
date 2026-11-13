class Solution {
    public char repeatedCharacter(String s) {
        // int n=s.length();
        // int [] freq=new int[26];
        // for(int i=0;i<n;i++){
        //     int ind=s.charAt(i)-'a';
        //      freq[ind]++;
        //     if(freq[ind]==2){
        //         return s.charAt(i);
        //     }
        // }
        // return ' ';
        

        int n=s.length();
        int [] freq=new int[26];
        for(int i=0;i<n;i++){
          freq[s.charAt(i)-'a']++;
          if(freq[s.charAt(i)-'a']==2){
            return s.charAt(i);
          }
        }
        return ' ';
    }
}