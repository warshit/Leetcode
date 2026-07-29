class Solution {
    private static final int LIMIT = 1_000_000;

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;

        int[] half = new int[26];
        char mid = 0;
        int halfLen = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLen += half[i];
            if ((freq[i] & 1) == 1) mid = (char) ('a' + i);
        }

        if (countWays(half) < k) return "";

        StringBuilder left = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;

                half[c]--;
                int ways = countWays(half);

                if (ways >= k) {
                    left.append((char) ('a' + c));
                    break;
                } else {
                    k -= ways;
                    half[c]++;
                }
            }
        }

        StringBuilder ans = new StringBuilder(left);
        if (mid != 0) ans.append(mid);
        ans.append(left.reverse());

        return ans.toString();
    }

    private int countWays(int[] cnt) {
        int total = 0;
        for (int x : cnt) total += x;

        long ways = 1;
        int rem = total;

        for (int x : cnt) {
            if (x == 0) continue;

            int comb = cappedComb(rem, x);

            ways *= comb;
            if (ways >= LIMIT) return LIMIT;

            rem -= x;
        }

        return (int) ways;
    }

    private int cappedComb(int n, int r) {
        r = Math.min(r, n - r);
        long res = 1;

        for (int i = 1; i <= r; i++) {
            long num = n - r + i;
            long den = i;

            long g = gcd(num, den);
            num /= g;
            den /= g;

            g = gcd(res, den);
            res /= g;
            den /= g;

            res *= num;
            if (res >= LIMIT) return LIMIT;
        }

        return (int) res;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}