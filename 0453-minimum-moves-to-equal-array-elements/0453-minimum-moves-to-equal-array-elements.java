class Solution {
    public int minMoves(int[] nums) {
        // int moves = 0;
        // while (true) {
        //     int min=nums[0];
        //     int max = nums[0];
        //     for (int num:nums) {
        //         min=Math.min(min, num);
        //         max=Math.max(max, num);
        // }

        //     if(min==max) {
        //         return moves;
        //     }
        //     for(int i=0;i<nums.length;i++) {
        //         if(nums[i] != max){
        //             nums[i]++;
        //         }
        //     }
        //     moves++;
        // }

//.......
        int min=nums[0];
        int moves=0;
        for(int num:nums) {
            min=Math.min(min,num);
        }
        for(int num:nums) {
            moves+=num-min;
        }
        return moves;
    }
}