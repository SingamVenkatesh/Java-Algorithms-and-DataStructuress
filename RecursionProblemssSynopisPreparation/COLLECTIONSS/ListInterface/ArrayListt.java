package RecursionProblemssSynopisPreparation.COLLECTIONSS.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListt
{
    public static void main(String[] args) {

        // capacity intially 10 then next time currentcapcity * 3/2 +1;
        ArrayList<Object> list=new ArrayList<>();
        list.add(23);
        list.add(3);
        list.add(5);
        list.add("venky");
        list.add(null);
        list.add(null);

        System.out.println(list.size());

        for (Object a:list)
        {
            System.out.println(a);
        }
    }
}
