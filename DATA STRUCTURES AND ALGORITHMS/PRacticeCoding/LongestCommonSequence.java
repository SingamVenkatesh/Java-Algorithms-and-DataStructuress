package RecursionLearning.PRacticeCoding;
import java.lang.reflect.Array;
import java.util.Arrays;
public class LongestCommonSequence {
    public static void main(String[] args)
    {
             int arr[]={1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
       // Input: ["flower", "flow", "flight"]
        //Output: "fl"
/*
        String arr[]={"flower","flowzzzzzzzzzz","flight"};

        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        String first=arr[0];
        String last=arr[arr.length-1];

        int i=0;
        while (i<first.length()&& i<last.length() && first.charAt(i)==last.charAt(i))
        {
            i++;
        }

        String ans=first.substring(0,i);
       // System.out.println(ans);


        String str1="singam venkatesh patel im the hero its true";
        String str2="singammm";
        //System.out.println("comparing 2 strings " + str1.compareTo(str2));

        String[] nums=str1.split(" ");
        System.out.println(Arrays.toString(nums));
        //System.out.println(nums[0]);
        String abc=str1.replace('i','x');
      //  System.out.println(abc);

        String g="123";

      //  System.out.println(String.valueOf(g));
        StringBuilder buil=new StringBuilder();
        buil.append("ab");
        buil.append("cd");
        buil.append("ef");
        buil.append("gh");
        buil.append("ij");
        System.out.println("this is string buider  " + buil);
        buil.deleteCharAt(4);
        System.out.println("this is string buider  " + buil);


*/
        int s=0;
        int e=arr.length-1;
        while(s<e)
        {
            if(arr[s]==0)
            {
                s++;
            }
            else if (arr[e]==1)
            {
                e--;
            }
            else
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        System.out.println(Arrays.toString(arr));



        int a=100;
        int b=50;
        System.out.println(a + " "+ b);
       a=a+b;
               b=a-b;
               a=a-b;
        System.out.println(a + " "+ b);



    }
}
