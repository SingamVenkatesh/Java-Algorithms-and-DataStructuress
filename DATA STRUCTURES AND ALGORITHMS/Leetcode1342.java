package RecursionLearning;

public class Leetcode1342 {
    public static void main(String[] args) {
        // leetcode problem : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

        int n=14;
       int ans=numberOfSteps(n);
        System.out.println(ans);

    }

        public static int numberOfSteps(int num) {


            return FUn(num,0);


        }
        public static int FUn(int n,int count)
        {


            if(n==0)
            {
                return count;
            }
            if(n%2==0)
            {

                return FUn(n/2,count+1);
            }

            return FUn(n-1,count+1);

        }


    }


