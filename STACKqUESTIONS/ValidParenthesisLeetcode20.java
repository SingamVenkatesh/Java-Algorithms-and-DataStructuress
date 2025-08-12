package STACKqUESTIONS;
import java.util.*;
class ValidParenthesisLeetcode20
{
    public boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray())
        {
            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets
            else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
            else if (ch == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }
            else if (ch == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}
