package RecursionProblemssSynopisPreparation;

import java.util.ArrayList;
import java.util.List;

public class ArraYListPracticess
{
    public static void main(String[] args)
    {
        /* this is below referece example of list to other list


  Scenario	            Explanation
Reference	You and your friend share the same Google Doc. If your friend edits it, you see it too.
Copy	    You download your own copy of the document. Now you both can edit separately.
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);

        List<Integer> list2=list1;
        list1.add(89);

        System.out.println(list1 + " " + list1.hashCode());
        System.out.println(list2 +" " + list2.hashCode());
        */


        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2=new ArrayList<>(list1);
        list1.add(234);

       // System.out.println(list1 + " " +  list1.hashCode());
       // System.out.println(list2 + " " +  list2.hashCode());

        List<List<Integer>> answer=new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        System.out.println(answer);


        for(List<Integer> a:answer)
        {
            System.out.println(a);
        }



    }
}
