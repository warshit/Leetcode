class Solution {
    // private static final int LIMIT = 1_000_000;

    public String smallestPalindrome(String s, int k) {
    //     int[] freq = new int[26];
    //     for (char ch : s.toCharArray()) freq[ch - 'a']++;

    //     int[] half = new int[26];
    //     char mid = 0;
    //     int halfLen = 0;

    //     for (int i = 0; i < 26; i++) {
    //         half[i] = freq[i] / 2;
    //         halfLen += half[i];
    //         if ((freq[i] & 1) == 1) mid = (char) ('a' + i);
    //     }

    //     if (countWays(half) < k) return "";

    //     StringBuilder left = new StringBuilder();

    //     for (int pos = 0; pos < halfLen; pos++) {
    //         for (int c = 0; c < 26; c++) {
    //             if (half[c] == 0) continue;

    //             half[c]--;
    //             int ways = countWays(half);

    //             if (ways >= k) {
    //                 left.append((char) ('a' + c));
    //                 break;
    //             } else {
    //                 k -= ways;
    //                 half[c]++;
    //             }
    //         }
    //     }

    //     StringBuilder ans = new StringBuilder(left);
    //     if (mid != 0) ans.append(mid);
    //     ans.append(left.reverse());

    //     return ans.toString();
    // }

    // private int countWays(int[] cnt) {
    //     int total = 0;
    //     for (int x : cnt) total += x;

    //     long ways = 1;
    //     int rem = total;

    //     for (int x : cnt) {
    //         if (x == 0) continue;

    //         int comb = cappedComb(rem, x);

    //         ways *= comb;
    //         if (ways >= LIMIT) return LIMIT;

    //         rem -= x;
    //     }

    //     return (int) ways;
    // }

    // private int cappedComb(int n, int r) {
    //     r = Math.min(r, n - r);
    //     long res = 1;

    //     for (int i = 1; i <= r; i++) {
    //         long num = n - r + i;
    //         long den = i;

    //         long g = gcd(num, den);
    //         num /= g;
    //         den /= g;

    //         g = gcd(res, den);
    //         res /= g;
    //         den /= g;

    //         res *= num;
    //         if (res >= LIMIT) return LIMIT;
    //     }

    //     return (int) res;
    // }

    // private long gcd(long a, long b) {
    //     while (b != 0) {
    //         long t = a % b;
    //         a = b;
    //         b = t;
    //     }
    //     return a;
     int[] freq = new int[26];
        int n = s.length();
        int cnt = 0;
        long totalWays = 1L;
        for(int i=0;i<n/2;i++){
            freq[s.charAt(i)-'a']++;
        }

        char[] alpha = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        StringBuilder sb = new StringBuilder();
        outer : for(int i=25;i>=0;i--){
            if(freq[i]==0)continue;
            int j=1;
            while(j<=freq[i]){
                cnt++;
                totalWays = (totalWays*cnt)/j;
                if(totalWays>k){
                    for(int l = 0;l<i;l++){
                        while(freq[l]>0){
                            sb.append(alpha[l]);
                            freq[l]--;
                        }
                    }
                    while(freq[i]>j){
                        sb.append(alpha[i]);
                        freq[i]--;
                    }
                    break outer;
                }
                j++;
            }
        }
        if(k>totalWays)return "";
        
        
        for(int i=0;i<cnt;i++){
            for(char ch= 'a';ch<='z';ch++){
                int j = ch-'a';
                if(freq[j]==0)continue;
                if(k<=(totalWays*freq[j])/(cnt-i)){
                   totalWays = (totalWays*freq[j])/(cnt-i);
                   freq[j]--;
                   sb.append(ch);
                   break;
                }
                else{
                    k = (int)(k - (totalWays*freq[j])/(cnt-i));
                }
            }
        }
        if(n%2==1){
            sb.append(s.charAt(n/2));
        }

        for(int i=n/2-1;i>=0;i--){
            sb.append(sb.charAt(i));
        }

        return sb.toString();
    }
}