class Solution {
    public boolean isPalindrome(String s) {

        String word=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reverced="";

        for(int i=word.length()-1;i>=0;i--){
            reverced+=word.charAt(i);
        }

        if(reverced.equals(word)){
            return true;
        }

        return false;
    }

        
}