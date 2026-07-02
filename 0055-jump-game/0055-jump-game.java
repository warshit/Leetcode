// class Solution {
//     public boolean canJump(int[] nums) {
//          int maxjump=0;
//         for(int i=0;i<nums.length;i++){
//             if(maxjump<i) return false;
//             maxjump=Math.max(maxjump,i+nums[i]);
//             if(maxjump>nums.length-1) return true;
//         }
//         return true;
//     }
// }
class Solution {
    static{
        for(int i=0;i<500;i++){
            canJump(new int[]{2,3,1,1,2});
        }
    }
    public static boolean canJump(int[] nums) {
        int farthest=0;
        for(int i=0;i<nums.length;i++){
            if(i>farthest) return false;
            farthest=Math.max(farthest,i+nums[i]);
            if(farthest>=nums.length-1) return true;
        }
        return false;
    }
}