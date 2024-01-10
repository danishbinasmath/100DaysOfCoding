public class Number_of_Ways_to_Divide_a_Long_Corridor {
    class Solution {
        public int numberOfWays(String corridor) {
            // Store 1000000007 in a variable for convenience
            final int MOD = 1_000_000_007;
    
            // Total number of ways
            long count = 1;
    
            // Number of seats in the current section
            int seats = 0;
    
            // Tracking Index of last S in the previous section
            Integer previousPairLast = null;
    
            // Keep track of seats in corridor
            for (int index = 0; index < corridor.length(); index++) {
                if (corridor.charAt(index) == 'S') {
                    seats += 1;
    
                    // If two seats, then this is the last S in the section
                    // Update seats for the next section
                    if (seats == 2) {
                        previousPairLast = index;
                        seats = 0;
                    }
    
                    // If one seat, then this is the first S in the section
                    // Compute product of non-paired neighbors
                    else if (seats == 1 && previousPairLast != null) {
                        count *= (index - previousPairLast);
                        count %= MOD;
                    }
                }
            }
    
            // If odd seats, or zero seats
            if (seats == 1 || previousPairLast == null) {
                return 0;
            }
    
            // Return the number of ways
            return (int) count;
        }
    }
}
