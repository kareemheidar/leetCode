class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        for (String word : words) {
            String w = word.toLowerCase();
            if(withinARow("qwertyuiop", w) || withinARow("asdfghjkl", w) || withinARow("zxcvbnm", w))
                result.add(word);
        }
        return result.toArray(new String[0]);
    }
    
    public boolean withinARow(String row, String word){
        for (int i = 0; i < word.length(); i++) {
            if(! row.contains(word.charAt(i)+""))
                return false;
        }
        return true;
    }

}