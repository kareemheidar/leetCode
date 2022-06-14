class Solution {
    public int getLucky(String s, int k) {
        String numbers = "";
        for (int i = 0; i < s.length(); i++) {
            numbers += String.valueOf(s.charAt(i) - 96);
        }
        int result = 0;
        while(true){
            if(k==0)
                return result;
            result = sum(numbers);
            numbers = String.valueOf(result);
            k--;
        }
    }
    public int sum(String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }
        return sum;
    }
}