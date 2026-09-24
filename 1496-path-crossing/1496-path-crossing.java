class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
      HashSet<String> set= new HashSet<>();
      int x=0;
      int y=0;
      set.add(x + ","+ y);
      for(int i=0;i<n;i++){
        char ch= path.charAt(i);
        if(ch=='N'){
            y++;
        }
        else if(ch=='S'){
            y--;
        }
          if(ch=='E'){
            x++;
        }
        else if(ch=='W'){
            x--;
        }
      String s= x +","+y;
      if(set.contains(s)){
        return true;
      }
      set.add(s);
      }
      return false;

    }
}