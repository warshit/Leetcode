class Solution {
    public int repeatedNTimes(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]) return nums[i];
        // }
        // return -1;
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])) return nums[i];
            else s.add(nums[i]);
        }
        return 0;
    }
}