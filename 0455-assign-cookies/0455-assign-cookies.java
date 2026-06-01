class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Arrays.sort(g);
        // Arrays.sort(s);
        // int i=0,j=0;
        // while(i<g.length && j<s.length){ if(g[i]<=s[j]) i++;
        // j++;}
        // return i;
        if(s.length == 0)return 0;
        Thread t1 = new Thread(() -> {Arrays.sort(g);});
        Thread t2 = new Thread(() -> {Arrays.sort(s);});
        t1.start();
        t2.start();
        try {
        t1.join();
        t2.join();
        }
        catch(InterruptedException e) {
        }
        int res = 0;
        int j = g.length - 1;
        int i = s.length - 1;
        while(i >= 0 && j >= 0){
            if(g[j] <= s[i]){
                res++;
                i--;j--;
            }else{
                j--;
            }
        }
        return res;
    }
}