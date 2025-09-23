class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        // int t=0,n=tickets.length;
        // Queue<Integer> q = new LinkedList<>();
        // for(int i=0;i<n;i++) q.offer(i);
        // int i=0;
        // while(tickets[k]>0){
        //     i=q.poll();
        //     t++;
        //     tickets[i]--;
        //     if(tickets[i]>0) q.offer(i);
        // }
        // return t;
        int time = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        
        return time;
    }
    }