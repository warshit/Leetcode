class Solution {
    public int[][] transpose(int[][] matrix) {
        // int[][] arr = new int[matrix[0].length][matrix.length];
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         // int t = matrix[i][j];
        //         arr[j][i]=matrix[i][j];
        //         // matrix[j][i]=t;
        //     }
        // }
        // return arr;
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] ans = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}