class Solution {
    public int minOperations(String[] logs) {
        int n = 0;
        for (String s : logs) {
            if(s.equals("./"))
                continue;
            if (s.equals("../")){
                if(n>0)
                    n--;
            }else {
                n++;
            }
        }
        return n;
    }
}