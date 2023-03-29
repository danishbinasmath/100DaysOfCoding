package Day63;

import java.util.PriorityQueue;

public class Last_Stone_Weight {
    class Solution {
        public int lastStoneWeight(int[] A) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
            for (int a : A)
                pq.offer(a);
            while (pq.size() > 1)
                pq.offer(pq.poll() - pq.poll());
            return pq.poll();
        }
    }
}
