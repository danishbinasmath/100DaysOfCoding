import java.util.HashSet;
import java.util.Set;

public class Path_Crossing {
    class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(x + "#" + y);
        for(int i=0; i<path.length(); i++) {
            char c = path.charAt(i);
            if(c == 'N') y++;
            if(c == 'S') y--;
            if(c == 'E') x++;
            if(c == 'W') x--;
            String str = x + "#" + y;
            if(set.contains(str)) return true;
            else set.add(str);
        }
        return false;
    }
}
}