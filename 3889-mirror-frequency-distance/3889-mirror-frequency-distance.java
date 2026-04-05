class Solution {
    public int mirrorFrequency(String s) {
    //    int[] f = new int[36];
        
    //     for (char c : s.toCharArray()) {
    //         if (Character.isDigit(c)) {
    //             f[c - '0']++;
    //         } else {
    //             f[10 + (c - 'a')]++;
    //         }
    //     }
        
    //     boolean[] v = new boolean[36];
    //     int r = 0;
        
    //     for (int i = 0; i < 36; i++) {
    //         if (v[i]) continue;
            
    //         int j;
    //         if (i < 10) {
    //             j = 9 - i;
    //         } else {
    //             j = 10 + (25 - (i - 10));
    //         }
            
    //         v[i] = true;
    //         v[j] = true;
            
    //         r += Math.abs(f[i] - f[j]);
    //     }
        
    //     return r; 
     int[] f = new int[128]; int r = 0, i = 0;
        for(int b : s.getBytes()) f[b]++;
        for(; i < 13; i++) r += Math.abs(f[i + 97] - f[122 - i]) + (i < 5 ? Math.abs(f[i + 48] - f[57 - i]) : 0);
        return r;
    }
}