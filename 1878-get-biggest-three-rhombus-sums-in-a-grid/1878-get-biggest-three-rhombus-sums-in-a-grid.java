class Solution {
    public int[] getBiggestThree(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                set.add(grid[i][j]);

                int k = 1;

                while (true) {

                    if (i + 2 * k >= m || j - k < 0 || j + k >= n)
                        break;

                    int sum = 0;

                    for (int t = 0; t < k; t++)
                        sum += grid[i + t][j + t];

                    for (int t = 0; t < k; t++)
                        sum += grid[i + k + t][j + k - t];

                    for (int t = 0; t < k; t++)
                        sum += grid[i + 2 * k - t][j - t];

                    for (int t = 0; t < k; t++)
                        sum += grid[i + k - t][j - k + t];

                    set.add(sum);

                    k++;
                }
            }
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        int size = Math.min(3, list.size());
        int[] res = new int[size];

        for (int i = 0; i < size; i++)
            res[i] = list.get(i);

        return res;
    }
}