class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                if(currLen > maxLen) maxLen = currLen;
            }
        }
        return maxLen;
    }
}