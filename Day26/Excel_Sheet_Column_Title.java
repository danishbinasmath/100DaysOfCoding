package Day26;

public class Excel_Sheet_Column_Title {
    class Solution {
        public String convertToTitle(int columnNumber) {
            return columnNumber==0 ? "" : convertToTitle(--columnNumber/26) + (char)('A' + (columnNumber%26));
        }
    }
}
