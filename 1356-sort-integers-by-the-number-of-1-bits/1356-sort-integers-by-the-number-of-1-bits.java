class Solution {
    public int[] sortByBits(int[] arr) {
         Integer[] b = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        
        Arrays.sort(b, (x, y) -> {
            int c = Integer.bitCount(x);
            int d = Integer.bitCount(y);
            
            if (c == d) {
                return x - y;
            }
            return c - d;
        });
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }
        
        return arr;
    }
}