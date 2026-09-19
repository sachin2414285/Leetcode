class Solution {
    public int chalkReplacer(int[] chalk, int k) {
//     int ind;
//     for(int i=0; ;i++){
//         int val=chalk[i%chalk.length];
//         if(k>=val){
//             k=k-val;
//         }
//        else if(k<val){
//             return i%chalk.length;
//         }
//     }
//     }
// }


//using while loop
// int i=0;
// int n=chalk.length;
// while(true){
//     int val=chalk[i%n];
//     if(val<=k){
//         k=k-val;
//     }
//     else if(val>k){
//         return i%n;
//     }
//     i++;
// }
//     }}



// .....optemal solution......


int n=chalk.length;
long sum=0;
for(int i=0;i<n;i++){
    sum+=chalk[i];
}
k=(int)(k%sum);
int i=0;
while(true){
    if(k<chalk[i]){
        return i;
    }
    k=k-chalk[i];
    i++;
}
    }}