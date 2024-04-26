class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsFrequency = new HashMap<>();
        for(int num : nums)
            numsFrequency.put(num, numsFrequency.getOrDefault(num, 0)+1); 
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(numsFrequency.entrySet());
        Collections.sort(entries, (a, b) -> b.getValue().compareTo(a.getValue()));

        int[] result = new int[k];
        for(int i=0; i<k; i++)
            result[i] = entries.get(i).getKey();

        return result;
    }
}