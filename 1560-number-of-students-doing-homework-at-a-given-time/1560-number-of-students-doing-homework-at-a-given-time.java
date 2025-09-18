class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int q) {
        int c=0;
        // if(startTime.length<=1) return 1;
        for(int i=0;i<startTime.length;i++){
            if(startTime[i]<=q && endTime[i]>=q) c++;
        }
        return c;
    }
}