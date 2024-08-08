class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] alist = new List[nums.length + 1];
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < alist.length; i++) {
            alist[i] = new ArrayList<>();
        }
        
        for (Integer num: nums){
            hash.put(num, hash.getOrDefault(num,0) + 1);
        }

        for (Map.Entry<Integer, Integer> temp : hash.entrySet()){
                alist[temp.getValue()].add(temp.getKey());
        }
        int[] ans = new int[k];

        int index=0;
        for (int i=alist.length-1; i>0;i--){
            for (Integer num: alist[i]){
                ans[index++] = num;
                if (index == k) return ans;
            }
        }
        return ans;
    }
}
