package RecursionLearning.LinkedList.LinkedListProblems;

public class HappyNUmber {
    public static void main(String[] args) {
//1, 7, 10, 13, 19, 23, 28, 31, 32, 44, 49, 68, 70, 79, 82, 86, 91, 94, 97, 100
        int n=12;
        System.out.println(isHappy(n));




    }
        public static boolean isHappy(int n)
        {
            int slow=n;
            int fast=n;
            do
            {
                slow=findsquare(slow);
                fast=findsquare(findsquare(fast));
            }
            while(slow!=fast);
            if(slow==1)
            {
                return true;
            }
            return false;
        }
      public static int findsquare(int num)
        {
            int ans=0;
            while(num>0)
            {
                int rem=num%10;
                ans=ans+rem*rem;
                num=num/10;
            }
            return ans;
        }
    }

