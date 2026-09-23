class Solution {
    public int maxDifference(String s) {
    //  HashMap<Character,Integer> freq= new HashMap<>();
    //  for(char str: s.toCharArray()){
    //  freq.put(str,freq.getOrDefault(str,0)+1);
    //  }
    //  int max=Integer.MIN_VALUE;
    // int min=Integer.MAX_VALUE;
    //  for(int val:freq.values()){
    //   if(val%2==1){
    //    max=Math.max(max,val);
    //   }
    //   else{
    //     min=Math.min(min,val);
    //   }
    //  }
    //  return max-min;
  

  //..........2nd app...........

    int [] freq= new int [26];
     for(char ch : s.toCharArray()){
        freq[ch-'a']++;
     }
     int max=Integer.MIN_VALUE;
     int min=Integer.MAX_VALUE;
     for(int ch:freq){
        if(ch==0){
            continue;
        }
        else if(ch%2==1){
            max=Math.max(max,ch);
        }
        else{
            min=Math.min(min,ch);
        }
     }
     int maxdiff= max-min;
     return maxdiff;
    }
}