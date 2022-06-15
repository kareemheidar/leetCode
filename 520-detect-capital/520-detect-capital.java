class Solution {
public boolean detectCapitalUse(String word) {
        boolean firstLetter = false;
        boolean allUp = true;
        boolean allLow = true;
        if(word.charAt(0) >= 65 && word.charAt(0) <= 90)
            firstLetter = true;
        for (int i = 1; i < word.length(); i++) {
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90)
                allLow = false;
            if(word.charAt(i) >= 97 && word.charAt(i) <= 122)
                allUp = false;
        }
        if (firstLetter) {
            if (allLow || allUp)
                return true;
        } else if (allLow) {
            return true;
        }
        return false;
    }
}