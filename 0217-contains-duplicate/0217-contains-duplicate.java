class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> history = new HashSet<Integer>();
        for(int num : nums){
            if(history.contains(num)) return true;
            history.add(num);
        }
        return false;

    }
}