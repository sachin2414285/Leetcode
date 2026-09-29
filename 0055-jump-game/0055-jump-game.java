class Solution {
//     public boolean solve(int [] nums, int index){
//         if(index==nums.length-1){
//             return true;
//         }
//         if(index>=nums.length){
//             return false;
//         }
//         if(nums[index]==0){
//             return false;
//         }
//         int jump=nums[index];
//         boolean rec= false;
//         for(int i=0;i<jump;i++){
//             boolean ans= solve(nums, index+jump);
//            rec= ans||rec;
//         }
//         return rec;
//     }
//     public boolean canJump(int[] nums) {
//         boolean ans= solve(nums,0);
//         return ans;
//     }
// }
 public boolean canJump(int[] nums) {
    int duur_vala =0;
    int n=nums.length;
    for(int i=0;i<n;i++){
        if(duur_vala <i){
            return false;
        }
        duur_vala=Math.max(duur_vala,i+nums[i]);
        if(duur_vala>=n-1){
            return true;
        }
    }
    return true;
 }
}