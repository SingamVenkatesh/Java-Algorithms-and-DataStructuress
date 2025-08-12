package RecursionLearning;

import java.util.Arrays;

public class ReversrOfstringarrayREc {

    public static void main(String[] args)
    {
        char[] s = {'h','e','l','l','0'};
       reverseString(s);
        System.out.println(Arrays.toString(s));

    }
        public static void reverseString(char[] s) {
            Functi(s,0,s.length-1);
        }
        public static void Functi(char[] c,int a,int b)
        {
            if(a>=b)
            {
                return;
            }
            char temp=c[a];
            c[a]=c[b];

            c[b]=temp;

            Functi(c,a+1,b-1);
        }
    }

 /*
        Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
         */