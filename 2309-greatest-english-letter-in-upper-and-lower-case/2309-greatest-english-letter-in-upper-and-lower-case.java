class Solution {
    public String greatestLetter(String s) {
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            char c1 = (char) (s.charAt(i)+32);
            char c2 = (char) (s.charAt(i)-32);
            if ( s.contains(c1 + "" ) ||  s.contains(c2 + "" )){
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
                    r = ss.charAt(i)+"";
            }
            return r;
        }

    }
}