package RecursionLearning.STACKSandQUEESS;
import java.util.Stack;
public class StackMain  {
    public static void main(String[] args) throws Exception
    {
        CustomStack stack=new CustomStack(5);
        DynamicStack dynamicStack=new DynamicStack(3); // in this stack size is incresed automatically when the size is full
     //   Stack<Integer> stack1=new Stack<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(16);
        stack.push(18);
        stack.push(45);
      //  System.out.println(stack.pop());


        dynamicStack.push(90);
        dynamicStack.push(92);
        dynamicStack.push(94);
        dynamicStack.push(96);
        dynamicStack.push(98);
        dynamicStack.push(100);







    }
}
