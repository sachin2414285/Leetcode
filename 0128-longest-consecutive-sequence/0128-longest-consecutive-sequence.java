class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set= new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max=0;
        for(int val : set){
            if(!set.contains(val-1)){
                int count=1;
                int x=val;
            while(set.contains(x+1)){
                count++;
                x++;
            }
            max=Math.max(count,max);
        }
        }
        return max;
    }
}