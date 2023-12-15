import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Destination_City {
    class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> hasOutgoing = new HashSet<>();
        for (int i = 0; i < paths.size(); i++) {
            hasOutgoing.add(paths.get(i).get(0));
        }
        
        for (int i = 0; i < paths.size(); i++) {
            String candidate = paths.get(i).get(1);
            if (!hasOutgoing.contains(candidate)) {
                return candidate;
            }
        }
        
        return "";
    }
}
}
