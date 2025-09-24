class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // List<List<Integer>> l = new ArrayList<>();
        // int n=nums.length;
        // // int k=Math.pow(2,n);
        // for(int i=0;i<(1<<n);i++){
        //     List<Integer> l1 = new ArrayList<>();
        //     for(int j=0;j<n;j++){
        //         if((i&(1<<j))>0) l1.add(nums[j]);
        //     }
        //     l.add(l1);
        // }
        // return l;
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {   
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) sub.add(nums[j]);
            }
            res.add(sub);
        }
        return res;
    }
}