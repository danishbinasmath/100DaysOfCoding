package Day374;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Players_With_Zero_or_One_Losses {
    class Solution {
        public List<List<Integer>> findWinners(int[][] matches) {
            Map<Integer, Integer> lossesMap = new HashMap<>();
    
            for (int[] match : matches) {
                int winner = match[0];
                int loser = match[1];
    
                lossesMap.put(winner, lossesMap.getOrDefault(winner, 0));
                lossesMap.put(loser, lossesMap.getOrDefault(loser, 0) + 1);
            }
    
            List<Integer> zeroLossPlayers = new ArrayList<>();
            List<Integer> oneLossPlayers = new ArrayList<>();
    
            for (Map.Entry<Integer, Integer> entry : lossesMap.entrySet()) {
                int playerId = entry.getKey();
                int lossCount = entry.getValue();
    
                if (lossCount == 0) {
                    zeroLossPlayers.add(playerId);
                } else if (lossCount == 1) {
                    oneLossPlayers.add(playerId);
                }
            }
    
            // Sort the lists in increasing order
            zeroLossPlayers.sort(null);
            oneLossPlayers.sort(null);
    
            List<List<Integer>> result = new ArrayList<>();
            result.add(zeroLossPlayers);
            result.add(oneLossPlayers);
    
            return result;
        }
    }   
}