class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int n=deck.length;
        for(int i=0;i<n;i++){
            q.offer(i);
        }
    int[] arr = new int[n];
    Arrays.sort(deck);
    for(int a : deck){
        int i = q.poll();
        arr[i]=a;
        q.offer(q.poll());
    }
    return arr;
    }
}