class Solution {
    public String convertToTitle(int columnNumber) {
        String columnName = "";
        while (columnNumber > 0) {
            columnNumber--;
            char c = (char) ('A' + columnNumber%26);
            columnName = c + columnName;
            columnNumber /= 26;
        }
        return columnName;
    }
}