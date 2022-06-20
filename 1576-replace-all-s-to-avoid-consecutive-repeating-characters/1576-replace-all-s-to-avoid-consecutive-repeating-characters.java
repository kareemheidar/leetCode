class Solution {
    public static String modifyString(String s) {
        if (s.length() == 1 && s.charAt(0) == '?')
            return "a";
        char c;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?'){
                if(i == 0){
                    c = (s.charAt(i+1) == 'a') ? 'b' : 'a';
                    s = s.substring(0,i) + c + s.substring(i+1);
                } else if (i == s.length()-1) {
                    c = (s.charAt(i-1) == 'a') ? 'b' : 'a';
                    s = s.substring(0,i) + c + s.substring(i+1);
                } else {
                    for (int j = 97; j < 123; j++) {
                        c = (char) j;
                        if (c != s.charAt(i-1) && c != s.charAt(i+1)){
                            s = s.substring(0,i) + c + s.substring(i+1);
                            break;
                        }
                    }
                }
            }
        }
        return s;
    }
}