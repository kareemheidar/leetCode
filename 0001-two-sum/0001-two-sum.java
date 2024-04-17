class Solution {
    public int[] twoSum(int[] nums, int target) {
        Integer[] numsAsInteger = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        for(int i = 0; i < numsAsInteger.length; i++) {
            if(Arrays.asList(numsAsInteger).contains(target - nums[i])){
                int j = Arrays.asList(numsAsInteger).indexOf(target - nums[i]);
                if(j != i) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}