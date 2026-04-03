class Solution {
       List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return res;
    }
    
    void dfs(int i, int n, int k) {
        if (cur.size() == k) {
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for (int j = i; j <= n; j++) {
            cur.add(j);
            dfs(j + 1, n, k);
            cur.remove(cur.size() - 1);
        }
    }
}