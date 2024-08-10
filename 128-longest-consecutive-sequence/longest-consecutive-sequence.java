class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, List<Integer>> hash = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            if (i != 0) if (nums[i-1] == nums[i]) continue;
            List<Integer> temp = hash.getOrDefault(nums[i], new ArrayList<Integer>());
            
            temp.add(nums[i]);
            hash.remove(nums[i]);
            hash.put(nums[i]+1, temp);
        }
        int max = 0;
        for(Map.Entry<Integer, List<Integer>> entry: hash.entrySet()){
            if (entry.getValue().size() > max)
                max = entry.getValue().size();
        }
        return max;
    }
}
