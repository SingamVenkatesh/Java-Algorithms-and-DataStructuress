package RecursionLearning.ARRAYLISTT;

import java.util.ArrayList;

public class Arrayyylistt {
    public static void main(String[] args) {


        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(list);

        int temp=list.get(0);
        list.set(0,list.get(4));
        list.set(4,temp);
        System.out.println(list);


    }
}
