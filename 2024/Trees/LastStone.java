class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = maxHeap.size();
        for(int stone : stones) {
            maxHeap.add(stone);
        }

        while(maxHeap.size() > 1) {
            int max1 = maxHeap.poll();
            int max2 = maxHeap.poll();

            if(max1 - max2 > 0) {
                maxHeap.add(max1 - max2);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
