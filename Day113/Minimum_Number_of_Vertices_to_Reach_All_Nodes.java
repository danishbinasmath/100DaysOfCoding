package Day113;

import java.util.*;

public class Minimum_Number_of_Vertices_to_Reach_All_Nodes {
    class Solution {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            List<Integer> res = new ArrayList<>();
            int[] seen = new int[n];
            for (List<Integer> e: edges)
                seen[e.get(1)] = 1;
            for (int i = 0; i < n; ++i)
                if (seen[i] == 0)
                    res.add(i);
            return res;
        }
    }
}
