package RecursionProblemssSynopisPreparation.COLLECTIONSS.Cursorss;

import java.util.*;
public class ListIteratorr {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        ListIterator<Integer> listtiterator=list.listIterator();



        while (listtiterator.hasNext())
        {
            Integer a=listtiterator.next();
            if(a==1)
            {
                listtiterator.set(1000);
                listtiterator.add(90);

            }
        }


        /*
        int i=1;
        while (listtiterator.hasNext())
        {
            Integer a = listtiterator.next();

            if(a==10)
            {
                iterator.remove();
                iterator.add(1);
            }


                if(a!=i)
                {
                    listtiterator.set(i);
                }

                i++;

            }

        */



      System.out.println(list); // Output: [One, Two Updated, Three]
    }
}
