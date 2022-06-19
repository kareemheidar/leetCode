class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char key = keysPressed.charAt(0);
        for (int i = 1; i < keysPressed.length(); i++) {
            if(releaseTimes[i] - releaseTimes[i-1] > max){
                max = releaseTimes[i] - releaseTimes[i-1];
                key = keysPressed.charAt(i);
            } else if (releaseTimes[i] - releaseTimes[i-1] == max) {
                key = (key > keysPressed.charAt(i)) ? key : keysPressed.charAt(i);
            }
        }
        return key;
    }
}