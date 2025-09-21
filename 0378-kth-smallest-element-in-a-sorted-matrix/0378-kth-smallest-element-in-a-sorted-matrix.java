class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int [] nums=new int[matrix[0].length*matrix[0].length];
        int a=0;
        for(int[] i:matrix){
            for(int j : i){
                // if(a<k){
                nums[a++]=j;
                // }
            }
        }
        Arrays.sort(nums);
        return nums[k-1];
    }
}