package RecursionLearning.STACKSandQUEESS.StackandQueusQUestions;
import java.util.*;
public class StringValidParenthesis {
    public static void main(String[] args) {
        String s="()[{}]{}";


        System.out.println(isValid(s));
    }
        public static boolean isValid(String s)
        {
            Stack<Character> stack=new Stack<>();
            char arr[]=s.toCharArray();
            for(char ch:arr)
            {
                if(ch=='('|| ch=='['|| ch=='{')
                {
                    stack.push(ch);
                }
                else
                {
                    if(ch==')')
                    {
                        if(stack.isEmpty() || stack.pop() !='(')
                        {
                            return false;
                        }
                    }
                    if(ch=='}')
                    {
                        if(stack.isEmpty() || stack.pop() !='{')
                        {
                            return false;
                        }
                    }
                    if(ch==']')
                    {
                        if(stack.isEmpty() || stack.pop() !='[')
                        {
                            return false;
                        }
                    }

                }
            }

            return stack.isEmpty();

        }
    }

