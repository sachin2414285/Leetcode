class Solution {
    public int passThePillow(int n, int time) {
        int p=1;
        int count=1;
        while(time>0){
            p=p+count;
            if(p==n||p==1){
                count=-count;
            }
            time--;
        }
        return p;
    }
}