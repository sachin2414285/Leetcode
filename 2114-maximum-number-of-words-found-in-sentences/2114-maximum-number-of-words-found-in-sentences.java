class Solution {
    public int mostWordsFound(String[] sentences){
        int max=Integer.MIN_VALUE;
        for(String st : sentences){
            int count=1;
            int n=st.length();
            for(int i=0;i<n;i++){
                if(st.charAt(i)==' '){
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}