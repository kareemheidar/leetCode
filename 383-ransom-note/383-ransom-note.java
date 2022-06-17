class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            if (! magazine.contains(""+ransomNote.charAt(i)))
                return false;
            int j = magazine.indexOf(ransomNote.charAt(i));
            magazine = magazine.substring(0, j) + '*' + magazine.substring(j + 1);

        }
        return true;
    }
}