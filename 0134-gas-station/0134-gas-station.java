class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int start=0;
        int c=0;
        int total=0;
        int diff=0;
        for(int i=0;i<n;i++){
            diff=gas[i]-cost[i];
            c=c+diff;
            total+=diff;
            if(c<0){
                start=i+1;
                c=0;  
            }
            }
             if(total<0){
                return -1;
        }
        return start;
    }
}