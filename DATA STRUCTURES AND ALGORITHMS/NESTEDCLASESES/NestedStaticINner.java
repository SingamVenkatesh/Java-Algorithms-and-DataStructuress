package RecursionLearning.NESTEDCLASESES;

public class NestedStaticINner
{
     class Inner
    {
        String name;
        Inner()
        {
            name="Venkatesh";
        }

        public void display()
        {
            System.out.println(name);

        }
    }
    public static void main(String[] args) {
        NestedStaticINner obj=new NestedStaticINner();
        NestedStaticINner.Inner obj2=obj.new Inner();
        obj2.display();
    }
}
