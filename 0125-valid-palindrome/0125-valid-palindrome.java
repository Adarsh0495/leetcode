class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder cleaner=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                cleaner.append(Character.toLowerCase(c));
            }
        }

        String cleanedStr=cleaner.toString();
            int n=cleanedStr.length();

            for(int i=0;i<n/2;i++){
            if(cleanedStr.charAt(i)!=cleanedStr.charAt(n-1-i)){
                return false;
            }
            }
            return true;
        
    }
}