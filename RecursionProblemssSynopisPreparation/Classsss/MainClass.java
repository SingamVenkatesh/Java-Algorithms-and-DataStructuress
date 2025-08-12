package RecursionProblemssSynopisPreparation.Classsss;

public class MainClass {
    public static void main(String[] args) {
        // Create outer class object
        cls1 outer = new cls1("venkatesh", 21);

        // Create inner class object using outer
        cls1.cls2 inner = outer.new cls2();

        // Check what outer.o is now pointing to
        cls1 referencedObj = outer.getO();
        System.out.println("outer.o points to: " + referencedObj.getS1() + ", " + referencedObj.getA());
    }
}
