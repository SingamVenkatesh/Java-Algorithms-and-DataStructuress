package RecursionLearning.LinkedList;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {


        // CIruclar linked list

        CCL clist=new CCL();
        clist.insert(2);
        clist.insert(4);
        clist.insert(6);
        clist.insert(8);
        clist.insert(10);

        clist.display();
        clist.deleTe(10);
        clist.display();



        /*
        DLL listD=new DLL();
       listD.insertFirst(5);
       listD.insertFirst(4);
      listD.insertFirst(3);
       listD.insertFirst(2);
        listD.insertFirst(1);
    //  listD.display();
      listD.insertLast(129);
        //  listD.display();
       listD.insert(2,100);
        LL list1=new LL();
        list1.insertFirst(12);
        list1.insertFirst(13);
        list1.insertFirst(14);
        list1.insertFirst(15);


      //  list1.find(14);

        //list1.display();

        //list1.insert(2,100);
       // list1.display();*/







/*
        // singlelinked list

         LL list=new LL();
          list.insertFirst(2);
          list.insertFirst(3);
          list.insertFirst(3);
          list.insertFirst(4);
          list.insertLast(89);
          list.insert(100,2);
          list.display();
        System.out.println(list.get(4));

         // list.display();

        //  list.deleteFIrst();
        //  list.display();
        //  list.deleteLast();
        //  list.display();
        //  list.delete(2);
         // list.display();

       // list.find(100);

        //System.out.println("element deleted "  + list.deleteLast());
      //  list.display();

*/

    }
}
