class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> numbers = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int result = numbers.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >= 0; i--) {
            if(numbers.get(s.charAt(i)) < numbers.get(s.charAt(i+1))){
                result -= numbers.get(s.charAt(i));
            }
            else{
                result += numbers.get(s.charAt(i));
            }
        }
        return result;
    }
}