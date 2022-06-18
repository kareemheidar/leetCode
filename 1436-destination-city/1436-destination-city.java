class Solution {
    public String destCity(List<List<String>> paths) {
        String destination = paths.get(0).get(1);
        for (int i = 0; i < paths.size(); i++) {
            if (paths.get(i).get(0).equals(destination)){
                destination = paths.get(i).get(1);
                i = 0;
            }
        }
        return destination;

    }
}