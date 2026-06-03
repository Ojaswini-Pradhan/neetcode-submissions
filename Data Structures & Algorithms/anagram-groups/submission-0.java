class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for(String word: strs){
            char[] charWord = word.toCharArray();
            Arrays.sort(charWord);
            String sortedS = new String(charWord);
            groups.putIfAbsent(sortedS, new ArrayList<>());
            groups.get(sortedS).add(word);
        }
        return new ArrayList<>(groups.values());
    }
}
