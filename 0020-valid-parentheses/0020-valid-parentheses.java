import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        // Loop through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // If the stack is empty, or the top of the stack doesn't match the closing bracket, return false
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                
                // Using 'else if' to check each closing bracket and match it with the top of the stack
                if (c == ')' && top != '(') {
                    return false;
                } else if (c == '}' && top != '{') {
                    return false;
                } else if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        
        // If the stack is empty, all brackets were matched; otherwise, return false
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isValid("()"));      // true
        System.out.println(solution.isValid("()[]{}"));  // true
        System.out.println(solution.isValid("(]"));      // false
        System.out.println(solution.isValid("([])"));    // true
    }
}
