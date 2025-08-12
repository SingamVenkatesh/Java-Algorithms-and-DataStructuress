package RecursionProblemssSynopisPreparation.Classsss;

public class cls1 {
    public cls1 o;
    private String s1;
    private int a;

    // Constructor
    public cls1(String s1, int a) {
        this.s1 = s1;
        this.a = a;
        System.out.println("Outer class created: " + s1 + ", " + a);
    }

    // Inner class
    class cls2 {
        public cls2() {
            o = new cls1("singam", 12); // assign new object to outer's `o` reference
            System.out.println("Inner class created, outer.o points to: " + o.s1 + ", " + o.a);
        }
    }

    // Getter for o (for external printing)
    public cls1 getO() {
        return o;
    }

    public String getS1() {
        return s1;
    }

    public int getA() {
        return a;
    }
}
