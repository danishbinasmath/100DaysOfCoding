package Day407;

public class Furthest_Building_You_Can_Reach {
    class Solution {
        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    
            for(int i = 0; i < heights.length - 1; i++) {
                if(heights[i] >= heights[i + 1]) continue;
    
                maxHeap.add(heights[i+1] - heights[i]);
                bricks = bricks - (heights[i+1] - heights[i]);
    
                if(bricks < 0) {
                    bricks = bricks + maxHeap.poll();
                    if(ladders > 0) ladders--;
                    else return i;
                }
            }
    
            return heights.length - 1;
        }
    }
}