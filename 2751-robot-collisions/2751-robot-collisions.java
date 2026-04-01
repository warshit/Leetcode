class Solution {
     public List<Integer> survivedRobotsHealths(int[] p, int[] h, String d) {
        int n = p.length;

        int[][] a = new int[n][4];
        for (int i = 0; i < n; i++) {
            a[i][0] = p[i];
            a[i][1] = h[i];
            a[i][2] = d.charAt(i);
            a[i][3] = i;
        }

        Arrays.sort(a, Comparator.comparingInt(x -> x[0]));

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (a[i][2] == 'R') {
                st.push(i);
            } else {
                while (!st.isEmpty() && a[i][1] > 0) {
                    int j = st.peek();

                    if (a[j][1] < a[i][1]) {
                        st.pop();
                        a[i][1]--;
                        a[j][1] = 0;
                    } else if (a[j][1] > a[i][1]) {
                        a[j][1]--;
                        a[i][1] = 0;
                        break;
                    } else {
                        st.pop();
                        a[j][1] = 0;
                        a[i][1] = 0;
                        break;
                    }
                }
            }
        }

        int[] r = new int[n];
        Arrays.fill(r, -1);

        for (int[] x : a) {
            if (x[1] > 0) {
                r[x[3]] = x[1];
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int x : r) {
            if (x != -1) res.add(x);
        }

        return res;   
    }
}