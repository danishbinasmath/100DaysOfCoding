package Day280;

public class Remove_Colored_Pieces_if_Both_Neighbors_are_the_Same_Color {
    class Solution {
        public boolean winnerOfGame(String colors) {
            int alice = 0;
            int bob = 0;
            
            for (int i = 1; i < colors.length() - 1; i++) {
                if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
                    if (colors.charAt(i) == 'A') {
                        alice++;
                    } else {
                        bob++;
                    }
                }
            }
            
            return alice - bob >= 1;
        }
    }
}
