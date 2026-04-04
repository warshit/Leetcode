class Solution {
    public String decodeCiphertext(String s, int r) {
        if (r == 0) return "";

        int n = s.length();
        int c = n / r;

        char[][] m = new char[r][c];
        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = s.charAt(k++);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < c; j++) {
            int i = 0, x = j;
            while (i < r && x < c) {
                sb.append(m[i][x]);
                i++;
                x++;
            }
        }

        int e = sb.length() - 1;
        while (e >= 0 && sb.charAt(e) == ' ') e--;

        return sb.substring(0, e + 1);
    }
}