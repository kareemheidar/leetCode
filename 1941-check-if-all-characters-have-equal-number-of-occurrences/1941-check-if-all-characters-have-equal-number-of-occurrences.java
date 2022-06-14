class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.isEmpty())
            return true;
        int[] occurrences = new int[26];
        for (int i = 0; i < s.length(); i++) {
            occurrences[s.charAt(i) -97]  += 1;
        }
        int x = occurrences[s.charAt(0) - 97];
        for (int i : occurrences) {
            if (i != 0 && i != x)
                return false;
        }
        return true;
    }
}