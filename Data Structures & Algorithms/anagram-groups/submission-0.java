class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<>();
        for(String word : strs){
            String sort = sortStr(word);
            map.putIfAbsent(sort, new ArrayList<>());
            map.get(sort).add(word);
        }
        return convertToList(map);
    }
    private List<List<String>> convertToList(Map<String , List<String>> map) {
         List<List<String>> result = new ArrayList<>();
         for(List<String> anagram : map.values()){
            result.add(anagram);
         }
         return result;
    }
    private String sortStr(String word){
        char [] ch = word.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
