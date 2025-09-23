class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int t=0,n=tickets.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++) q.offer(i);
        int i=0;
        while(tickets[k]>0){
            i=q.poll();
            t++;
            tickets[i]--;
            if(tickets[i]>0) q.offer(i);
        }
        return t;
    }
    }