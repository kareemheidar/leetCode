class Solution {
    public int countPoints(String rings) {
        Map<Integer,String> rods = new HashMap<>();
        int n;
        for (int i = 0; i < 10; i++) {
            rods.put(i,"");
        }
        for (int i = 0; i < rings.length(); i += 2) {
            n = Character.getNumericValue(rings.charAt(i + 1));
            String s = rods.get(n) + rings.charAt(i);
            rods.replace(n, s);
        }
        n = 0;
        for (int i : rods.keySet()) {
            if(rods.get(i).indexOf('R') != -1 && rods.get(i).indexOf('G') != -1 && rods.get(i).indexOf('B') != -1)
                n++;
        }
        return n;
    }
}