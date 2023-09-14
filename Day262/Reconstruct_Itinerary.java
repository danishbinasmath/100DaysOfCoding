package Day262;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Reconstruct_Itinerary {
    class Solution {
    // Use PQ to store arrival airport in ascending order
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    Stack<String> st = new Stack<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for (List<String> ticket : tickets){
            String dep = ticket.get(0);
            String arr = ticket.get(1);

            map.computeIfAbsent(dep, k -> new PriorityQueue<>()).offer(arr);
        }

        // trace eulerian path
        // we know there is a valid answer
        // and we must start with airport JFK
        dfs("JFK");

        List<String> mainAns = new ArrayList<>();
        while (st.size() > 0) mainAns.add(st.pop());
        return mainAns;

    }

    public void dfs(String airport){
        // if no arrival remaining 
        // add it to path
        if (map.getOrDefault(airport, new PriorityQueue<>()).size() == 0) {
            st.add(airport);
            return;
        }

        // removal of arrival airports leads to no cycle trap
        // as when you arrive at airport B from A, then you remove it from A's list
        // thus arriving at A again doesnt lead to going to B again
        while (map.get(airport).size() > 0) dfs(map.get(airport).remove());

        // once done tracing itinerary for all path 
        // add this airport to answer
        st.add(airport);
    }


}
}
