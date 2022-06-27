class Solution {
    public String greatestLetter(String s) {
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            if ( s.contains(((char) (s.charAt(i)+32)) + "" ) ||  s.contains(((char) (s.charAt(i)-32)) + "" )){
                ss += s.charAt(i);
            }
        }
        if (ss.isEmpty()){
            return ss;
        } else {
            ss = ss.toUpperCase();
            String r = ss.substring(0,1);
            for (int i = 0; i < ss.length(); i++) {
                if (ss.charAt(i) > r.charAt(0))
                    r = ss.substring(i,i+1);
            }
            return r;
        }

    }
}