package RecursionProblemssSynopisPreparation.COLLECTIONSS.Cursorss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteratorr
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(3);
        list.add(4);
        list.add(232);
        list.add(244);
        Iterator<Integer> iterator=list.iterator();

        while (iterator.hasNext())
        {
            Integer a=iterator.next();
            System.out.println(a);
            if(a==244)
            {
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
