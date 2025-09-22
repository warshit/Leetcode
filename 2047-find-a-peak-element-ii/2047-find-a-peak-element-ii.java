class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max=Integer.MIN_VALUE;
        int[] arr = new int[2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(max<mat[i][j]){
                    max=mat[i][j];
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}