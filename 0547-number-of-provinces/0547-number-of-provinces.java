class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int pro=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i]==false){
              pro++;
              Queue<Integer> q = new LinkedList<>();
                q.add(i);
              vis[i]=true;
            while(!q.isEmpty()){
               int city= q.peek();
               q.remove();
               for(int j=0;j<n;j++){
                if(isConnected[city][j]==1 && vis[j]==false){
                    vis[j]=true;
                    q.add(j);
                }
               }
            }
        }
        }
        return pro;
    }
}