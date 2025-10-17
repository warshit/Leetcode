class Solution {
    public int myAtoi(String s) {
        // int a=Integer.parseInt(s);
        // return a;
        if (s == null || s.length() == 0) return 0;
        
        int i = 0, n = s.length();
        long res = 0;
        int si = 1;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            si = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int d = s.charAt(i) - '0';
            res = res * 10 + d;

            if (si * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (si * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (si * res);
        
    }
}