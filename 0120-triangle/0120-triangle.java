class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    //     int ans=0;
    //         int i=0;
    //     for(List<Integer> l : triangle){
    //        ans+= min(l,i);
    //     }
    //     return ans;
    // }
    // private int min(List<Integer> l){
    //         l.sort(null);
    //         return l.get(0);
    // }
     int n = triangle.size();
          int[] dp = new int[n + 1];

          for (int i = n - 1; i >= 0; i--) {
               List<Integer> row = triangle.get(i);
               for (int j = 0; j < row.size(); j++) {
                    dp[j] = Math.min(dp[j], dp[j + 1]) + row.get(j);
               }
          }
          return dp[0];
    }

}