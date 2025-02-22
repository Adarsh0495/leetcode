class Solution {
    public boolean isAcronym(List<String> words, String s)
    {
        StringBuilder letters = new StringBuilder();
        for (String word : words) {

                letters.append(word.charAt(0));
            
        }
        return letters.toString().equals(s);
    }
}
