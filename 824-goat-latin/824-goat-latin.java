class Solution {
    public String toGoatLatin(String sentence) {
        String[] wordsArray = sentence.split("\\s+");
        StringBuffer[] words = new StringBuffer[wordsArray.length];
        for(int i=0;i<words.length;i++){
            words[i] = new StringBuffer(wordsArray[i]);
        }
        String vowels = "aeiouAIEOU";
        StringBuffer a = new StringBuffer();
        for (StringBuffer word : words) {
            if (vowels.contains(word.charAt(0) + "")) {
                word.append("ma");
            } else {
                word.append(word.charAt(0)).append("ma");
                word.deleteCharAt(0);
            }
            a.append("a");
        }
        for (int i = 0; i < words.length; i++) {
            words[i].append(a.substring(0,i+1));
        }
        StringBuffer output = new StringBuffer();
        for(int i=0;i< words.length;i++){
            output.append(words[i]+" ");
        }
        return output.substring(0,output.length()-1).toString();
    }
}