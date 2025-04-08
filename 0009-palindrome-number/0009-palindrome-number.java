class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 ||( x%10 == 0 && x !=0 )){
            return false;
        }

            int reversed=0;
            int current=x;

            while(x>0){
                int digit=x%10;
                reversed=reversed*10+digit;
                x=x/10;
            }
            return reversed==current;
        
        
    }
}