class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hash_map = new HashMap<>();

		for (String s: strs){
			int[] count = new int[26];

			for (char c : s.toCharArray()){
				count[c-'a']++;
			}
			String key = Arrays.toString(count);

			if(!hash_map.containsKey(key)){
				hash_map.put(key, new ArrayList<>());
			}
			hash_map.get(key).add(s);
		}
		return new ArrayList<>(hash_map.values());
    }
}
