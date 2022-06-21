class Solution {
    public int countValidWords(String sentence) {
        sentence = sentence.replaceAll("^\\s+","");
        String[] words = sentence.split("\\s+");
        int n = 0;
        for (String word : words) {
            if(word.matches(".*\\d.*")){
                continue;
            }
            if (validHyphen(word) && validPunctuation(word)) {
                n++;
            }
        }
        return n;
    }
    public boolean validHyphen(String s){
        if (s.indexOf('-') == -1)
            return true;
        if (s.indexOf('-') == 0)
            return false;
        if(s.indexOf('-') == s.length()-2)
            return s.charAt(s.length()-1)!='.' && s.charAt(s.length()-1)!=',' && s.charAt(s.length()-1)!='!' && s.charAt(s.length()-1)!='-';
        return s.charAt(0)!='-' && s.charAt(s.length()-1)!='-' && !s.substring(s.indexOf('-')+1).contains("-");
    }

    public boolean validPunctuation(String s){
        if (s.length() == 1)
            return true;
        return !s.substring(0, s.length() - 1).contains("!") && !s.substring(0, s.length() - 1).contains(",") && !s.substring(0, s.length() - 1).contains(".");
    }
}