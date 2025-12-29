class Solution {
    public int[][] insert(int[][] inte, int[] newInterval) {
            int[][] in = new int[inte.length + 1][];
            for (int i = 0; i < inte.length; i++) {
            in[i] = inte[i];
        }
        in[inte.length] = newInterval;
        Arrays.sort(in,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> l = new ArrayList<>();
        for(int[] i:in){
            if(l.isEmpty()) l.add(i);
            else if(l.get(l.size()-1)[1]<i[0]) l.add(i);
            else l.get(l.size()-1)[1]=Math.max(l.get(l.size()-1)[1],i[1]);
        }
        return l.toArray(new int[l.size()][]);
    }
}